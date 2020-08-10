import java.util.Scanner;

public class Main {

	static Scanner scanner;
	
	// CHALLENGE.
	// Create a single room of a house using the principle of composition.
		// Think about the things that should be included in the room. 
		// This may include physical parts of the house or furniture.
	// Add at least one method to access an object via a getter and then 
	// that objects public method as you saw in the previous video.
	// Then add at least one method to hide the object, e.g. not using a getter
	// but to access the object used in composition within the main class
	// like you saw in this video. 
	
	public static void main(String[] args) {
		Bedroom bedroom = new Bedroom();
		
		bedroom.executeADay();
	}
	
	public static void pause() {
		System.out.println("\nPress Enter to continue...\n");
		scanner.nextLine();
	}
}
