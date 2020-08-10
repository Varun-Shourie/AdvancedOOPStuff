
import java.util.*;

public class OrderSystem {
	
	static Scanner scanner;
	
	private Hamburger hamburger;
	
	public OrderSystem() {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		OrderSystem orderSystem = new OrderSystem();
		
		orderSystem.displayMenu();
		orderSystem.takeOrder();
	}
	
	public static boolean convertToBoolean(String userInput) {
		if(userInput.equalsIgnoreCase("Y"))
			return true;
		else
			return false;
	}
	
	public void displayMenu() {
		Hamburger hamburger = new Hamburger();
		HealthyBurger healthyBurger = new HealthyBurger();
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		
		System.out.println("\t\tBill's Burgers -- Menu\n");
		
		System.out.printf("%-20s $%.2f\n\n", hamburger.getName() + ":", hamburger.getBasePrice());
		
		System.out.println("Possible additions: \n");
		System.out.printf("%-20s $%.2f\n", "Lettuce:", Hamburger.getLettucePrice());
		System.out.printf("%-20s $%.2f\n", "Tomatoes:", Hamburger.getTomatoesPrice());
		System.out.printf("%-20s $%.2f\n", "Onions:", Hamburger.getOnionsPrice());
		System.out.printf("%-20s $%.2f\n", "Pickles:", Hamburger.getPicklesPrice());
		
		System.out.println("\n**********************************\n");
		
		System.out.printf("%-20s $%.2f\n\n", healthyBurger.getName() + ":", healthyBurger.getBasePrice());
		System.out.println("Possible additions: \n");
		System.out.printf("%-20s $%.2f\n", "Lettuce:", HealthyBurger.getLettucePrice());
		System.out.printf("%-20s $%.2f\n", "Tomatoes:", HealthyBurger.getTomatoesPrice());
		System.out.printf("%-20s $%.2f\n", "Onions:", HealthyBurger.getOnionsPrice());
		System.out.printf("%-20s $%.2f\n", "Pickles:", HealthyBurger.getPicklesPrice());
		System.out.printf("%-20s $%.2f\n", "Egg:", HealthyBurger.getEggPrice());
		System.out.printf("%-20s $%.2f\n", "Cucumbers:", HealthyBurger.getCucumbersPrice());
		
		System.out.println("\n**********************************\n");
		
		System.out.printf("%-20s $%.2f\n\n", deluxeBurger.getName() + ":", deluxeBurger.calculateTotal());
		System.out.printf("Additions (included with %.2f fee): \n\n", deluxeBurger.calculateTotal());
		System.out.printf("%-20s $%.2f\n", "Chips:" , DeluxeBurger.getChipsPrice());
		System.out.printf("%-20s $%.2f\n\n", "Drinks:", DeluxeBurger.getDrinksPrice());
	}
	
	public void promptOrder() {
		Hamburger hamburger = new Hamburger();
		HealthyBurger healthyBurger = new HealthyBurger();
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		
		System.out.println("Bill's Burgers - Order\n");
		
		System.out.println("Possible options:\n" + "(1) " + hamburger.getName() + "\n" 
				+ "(2) " + healthyBurger.getName() + "\n" + "(3) " + deluxeBurger.getName() + "\n");
	}
	
	public static int readInteger(String displayString) {
		int numberOfErrors = 0;
		int number = 0;
		
		boolean repeatInput = false;
		
		do {
			try {
				System.out.print(displayString);
				number = Integer.parseInt(scanner.nextLine());
				
				repeatInput = false;
				
				if(numberOfErrors == 2) {
					System.out.println("\nUser has made too many errors in entering data. Please enter a key to exit.");
					scanner.nextLine();
					
					System.exit(0);
				}
				
				if(number < 1 || number > 3) {
					repeatInput = true;
					numberOfErrors++;
				}
			}
			catch (NumberFormatException nfe) {
				if(numberOfErrors == 2) {
					System.out.println("\nUser has made too many errors in entering data. Please enter a key to exit.");
					scanner.nextLine();
					
					System.exit(0);
				}
				else {
					System.out.println("\nInput must be a valid integer. Try again.\n");
					
					repeatInput = true;
					numberOfErrors++;
				}
			}
		} while (repeatInput);
		
		return number;
	}
	
	public static String readString(String displayString) {
		String userInput = "";
		boolean repeatInput = false;
		int numberOfErrors = 0;
		
		do {
			System.out.print(displayString);
			userInput = scanner.nextLine();
			
			if(numberOfErrors == 2) {
				System.out.println("User has committed too many errors. Please press Enter to exit.");
				scanner.nextLine();
				
				System.exit(0);
			}
			
			if(userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N")) {
				return userInput;
			}
			else {
				repeatInput = true;
				
				numberOfErrors++;
				System.out.println("Invalid input. Please enter Y or N only.");
			}
				
		} while(repeatInput);
	
		return "-1";
	}
	
	public void takeOrder() {
		int options = 0;
		
		boolean lettuce = false;
		boolean tomatoes = false;
		boolean onions = false;
		boolean pickles = false;
		boolean eggs = false;
		boolean cucumbers = false;
		
		String wantLettuce = "";
		String wantTomatoes = "";
		String wantOnions = "";
		String wantPickles = "";
		String wantEggs = "";
		String wantCucumbers = "";
		
		options = OrderSystem.readInteger("Enter options 1-3: ");
		
		System.out.println("\nYou will be prompted with extra ingredients. Please enter Y or N if prompted.\n");
		
		switch(options) {
		case 1:
			wantLettuce = OrderSystem.readString("Lettuce: ");
			lettuce = OrderSystem.convertToBoolean(wantLettuce);
			
			wantTomatoes = OrderSystem.readString("Tomatoes: ");
			tomatoes = OrderSystem.convertToBoolean(wantTomatoes);
			
			wantOnions = OrderSystem.readString("Onions: ");
			onions = OrderSystem.convertToBoolean(wantOnions);
			
			wantPickles = OrderSystem.readString("Pickles: ");
			pickles = OrderSystem.convertToBoolean(wantPickles);
			
			hamburger = new Hamburger(lettuce, tomatoes, onions, pickles);
			
			System.out.println("No further input necessary. Have a nice day. Here's a receipt of your order.\n");
			
			hamburger.displayReceipt();
			break;
		case 2:
			wantLettuce = OrderSystem.readString("Lettuce: ");
			lettuce = OrderSystem.convertToBoolean(wantLettuce);
			
			wantTomatoes = OrderSystem.readString("Tomatoes: ");
			tomatoes = OrderSystem.convertToBoolean(wantTomatoes);
			
			wantOnions = OrderSystem.readString("Onions: ");
			onions = OrderSystem.convertToBoolean(wantOnions);
			
			wantPickles = OrderSystem.readString("Pickles: ");
			pickles = OrderSystem.convertToBoolean(wantPickles);
			
			wantEggs = OrderSystem.readString("Eggs: ");
			eggs = OrderSystem.convertToBoolean(wantEggs);
			
			wantCucumbers = OrderSystem.readString("Cucumbers: ");
			cucumbers = OrderSystem.convertToBoolean(wantCucumbers);
			
			System.out.println("No further input necessary. Have a nice day. Here's a receipt of your order.\n");
			
			hamburger = new HealthyBurger(lettuce, tomatoes, onions, pickles, eggs, cucumbers);
			hamburger.displayReceipt();
			break;
		case 3:
			System.out.println("No further input necessary. Have a nice day. Here's a receipt of your goods.\n");
			
			hamburger = new DeluxeBurger();
			hamburger.displayReceipt();
		
		}
		
	}
}
