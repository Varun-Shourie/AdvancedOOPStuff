import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Player implements ISaveable {
	
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public Player() {
		this("John Doe");
	}
	
	public String getName() {
		return name;
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
			System.out.print("Populating player actions into a log: Menu\n");
			System.out.print("Enter ! to exit. Anything else will be logged onto the Player log >>\n");
			userInput = scanner.nextLine();
		
			if(userInput.equalsIgnoreCase("!")) {
				System.out.print("\nPlayer log complete.\n");
				return;
			}
			else
				list.add(userInput);
		}
	}

	@Override
	public String toString() {
		return "\nPlayer name is " + name + ".\n";
	}

	
}
