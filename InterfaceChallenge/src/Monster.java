import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monster implements ISaveable {

	private String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public Monster() {
		this("Godzilla");
	}

	@Override
	public List write() {
		ArrayList<String> values = new ArrayList<>();
		
		return values;
	}

	@Override
	public void read(List list) {
		
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		
		while(! userInput.equals("!")) {
			System.out.print("Populating monster actions into a log: Menu\n");
			System.out.print("Enter ! to exit. Anything else will be logged onto the monster log >>\n");
			userInput = scanner.nextLine();
		
			if(userInput.equalsIgnoreCase("!")) {
				System.out.print("\nMonster log complete.\n");
				return;
			}
			else
				list.add(userInput);
		}
	}

	@Override
	public String toString() {
		return "\nMonster name is " + name + ".\n";
	}
}
