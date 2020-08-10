import java.util.Scanner;

public class Main {

	// Instructions
	// Create a generic class to implement a league table for a sport.
	// The class should allow teams to be added to the list, and store 
	// a list of teams that belong to the league. 
	
	// Your class should have a method to print out the teams in order. 
	// with the team at the top of the league printed first.
	
	// Only teams of the same type should be added to any particular instance
	// of the league class - the program should fail to compile if an attempt
	// is made to add an incompatible team. 
	
	private static League<Basketball> nba = new League<>("NBA");
	private static Scanner scanner = new Scanner(System.in);
	private static int numberOfErrors = 0;
	
	public static void main(String[] args) {
		
		addPresetTeams();
		
		do {
			int userInput = prompt();
			
			switch(userInput) {
			case 1:
				addTeam();
				break;
			case 2:
				showTeams();
				break;
			case 3:
				exit();
				break;
			}
		} while(true);
	}
	
	private static void addPresetTeams() {
		nba.addTeam(new Team<Basketball>("Portland Trail Blazers", 41, 41));
		nba.addTeam(new Team<Basketball>("Phoenix Suns", 38, 44));
		nba.addTeam(new Team<Basketball>("Utah Jazz", 44, 38));
		nba.addTeam(new Team<Basketball>("Los Angeles Lakers", 1, 70));
		nba.addTeam(new Team<Basketball>("Los Angeles Clippers", 45, 37));
		nba.addTeam(new Team<Basketball>("Detroit Pistons", 60, 2));
		nba.addTeam(new Team<Basketball>("Toronto Raptors", 56, 9));
	}
	
	private static void addTeam() {
		System.out.println("\nNBA League - Adding a New Team.\n");
		
		System.out.println("Type in the new team's name: ");
		String newTeam = scanner.nextLine();
		
		boolean isTeamAdded = nba.addTeam(new Team<Basketball>(newTeam));
		
		if(isTeamAdded) {
			System.out.println(newTeam + " was successfully added.");
		}
		else {
			System.out.println(newTeam + " was already in the league.");
		}
		
		System.out.println();
	}
	
	private static void exit() {
		System.out.print("Press enter to exit.");
		scanner.nextLine();
		System.exit(0);
	}
	
	private static void showTeams() {
		System.out.println("\nNBA League - Rankings.\n");
		
		nba.rank();
		
		System.out.println();
	}
	
	private static int prompt() {
		System.out.println("NBA League Application -- Options\n");
		
		System.out.println("1. Add a team.");
		System.out.println("2. Look at the existing teams in the league by ranking.");
		System.out.println("3. Exit the application.\n");
		
		int userInput = 0;
		
		while(userInput < 1 || userInput > 3) {
			userInput = readInput("Please enter a number between 1 and 3");
			
			if(userInput < 0)
				numberOfErrors++;
			
			if(numberOfErrors == 3) {
				System.out.println("Too many errors. Buh-bye. You're done. Enter a key to exit.");
				scanner.nextLine();
				System.exit(0);
			}
		}
		
		numberOfErrors = 0;
		
		return userInput;
	}
	
	private static int readInput(String displayPrompt) {
		try {
			System.out.print(displayPrompt + ": ");
			int userInput = Integer.parseInt(scanner.nextLine());
			return userInput;
		}
		catch(Exception e) {
			System.out.println("\nTry again.\n");
			numberOfErrors++;
		}
		
		return -1;
	}
}
