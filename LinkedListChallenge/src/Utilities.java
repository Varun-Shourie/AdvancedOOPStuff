import java.util.Scanner;

public class Utilities {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static Scanner getScanner() {
		return scanner;
	}
	
	public static void printFormatted(String argument1) {
		System.out.printf("%-30s\n", argument1);
	}
	
	public static void printFormatted(double double1) {
		Double number = double1;
		printFormatted(number.toString());
	}
	
	public static void printFormatted(int argument1, String argument2, double argument3) {
		System.out.printf("%-6d %-30s %.2f\n", argument1, argument2, argument3);
	}
	
	public static void printFormatted(String argument1, double argument2) {
		System.out.printf("%-30s %.2f\n", argument1, argument2);
	}
	
	public static void printFormatted(String argument1, String argument2) {
		System.out.printf("%-30s %-10s\n", argument1, argument2);
	}
	
	public static void printFormatted(String argument1, String argument2, String argument3) {
		System.out.printf("%-6s %-30s %-10s\n", argument1, argument2, argument3);
	}
	
	public static void printFormatted(int argument1, String argument2) {
		System.out.printf("%-10d %-30s\n", argument1, argument2);
	}

	public static String readStringInput(String displayPrompt) {
		String userInput = "";

        System.out.print(displayPrompt);
        userInput = scanner.nextLine();

        return userInput;
	}
	
	public static double readDouble(String displayString) {
        int numberOfErrors = 0;
        double number = 0;

        boolean repeatInput = false;

        // Keeps track of the number of times a user inputs incorrectly formatted input.
        do
        {
            try
            {
                System.out.print(displayString);
                number = Double.parseDouble(scanner.nextLine());

                // Set false only in case the input is valid.
                repeatInput = false;
            }
            catch (NumberFormatException fe)
            {
                if (numberOfErrors == 2)
                {
                    System.out.print("\nUser has made too many errors in entering data. Please enter a key to exit. \n");
                    scanner.nextLine();

                    System.exit(0);
                }
                else
                {
                    System.out.print("\nInput must be a valid integer. Try again. \n\n");

                    // Set to true to suggest the user has made a mistake and should try again.
                    repeatInput = true;

                    numberOfErrors++;
                }
            }
            catch(Exception e)
            {
                if (numberOfErrors == 2)
                {
                    System.out.print("\nUser has made too many errors in entering data. Please enter a key to exit. \n");
                    scanner.nextLine();

                    System.exit(0);
                }
                else
                {
                    System.out.print("\nInput must be a valid integer. Try again. \n\n");

                    // Set to true to suggest the user has made a mistake and should try again.
                    repeatInput = true;

                    numberOfErrors++;
                }
            }

        } while (repeatInput);

        return number;
    }
	
	public static int readInteger(String displayString) {
        int numberOfErrors = 0;
        int number = 0;

        boolean repeatInput = false;

        // Keeps track of the number of times a user inputs incorrectly formatted input.
        do
        {
            try
            {
                System.out.print(displayString);
                number = Integer.parseInt(scanner.nextLine());

                // Set false only in case the input is valid.
                repeatInput = false;
            }
            catch (NumberFormatException fe)
            {
                if (numberOfErrors == 2)
                {
                    System.out.print("\nUser has made too many errors in entering data. Please enter a key to exit. \n");
                    scanner.nextLine();

                    System.exit(0);
                }
                else
                {
                    System.out.print("\nInput must be a valid integer. Try again. \n\n");

                    // Set to true to suggest the user has made a mistake and should try again.
                    repeatInput = true;

                    numberOfErrors++;
                }
            }
            catch(Exception e)
            {
                if (numberOfErrors == 2)
                {
                    System.out.print("\nUser has made too many errors in entering data. Please enter a key to exit. \n");
                    scanner.nextLine();

                    System.exit(0);
                }
                else
                {
                    System.out.print("\nInput must be a valid integer. Try again. \n\n");

                    // Set to true to suggest the user has made a mistake and should try again.
                    repeatInput = true;

                    numberOfErrors++;
                }
            }

        } while (repeatInput);

        return number;
    } 
}
