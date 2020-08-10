
public class BankSystem {

	private Bank bank;
	
	public BankSystem() {
		bank = new Bank("J.P. Morgan Chase Bank");
		bank.addBranch();
		bank.addCustomer();
	}
	
	public void executeMenu() {
		
		boolean repeatLoop = true;
		int numberOfErrors = 0;
		
		do {

			showMenu();
		
			int userChoice = Utilities.readInteger("Select an option from above: ");
			
			if(numberOfErrors == 3) {
				System.out.println("Too many mistakes. Please press ENTER to exit my application.");
				Utilities.getScanner().nextLine();
				System.exit(0);
			}
			else if(userChoice >= 1 && userChoice <= 5) {
				numberOfErrors = 0;
			}
			
		
			switch(userChoice) {
			case 1:
				bank.showCustomersInBranches();
				break;
			case 2:
				bank.addBranch();
				break;
			case 3:
				bank.addTransaction();
				break;
			case 4:
				bank.addCustomer();
				break;
			case 5:
				quitSystem();
				break;
			default:
				System.out.println("Invalid numeric input. Please try again.");
				numberOfErrors++;
				break;
			}
			
			System.out.println();
		
		} while (repeatLoop);
	}
	
	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		bankSystem.executeMenu();
	}
	
	public void showMenu() {
		System.out.println("\t\tBank System for " + bank.getBankName() + " - Menu\n");
		
		System.out.println("1 -- Show a list of existing branches with customers.\n" 
							+ "2 -- Add a new branch to the bank system.\n"
							+ "3 -- Add a transaction to an existing customer.\n"
							+ "4 -- Add a new customer to a bank branch.\n"
							+ "5 -- Press to quit the loop.\n");
	}
	
	public void quitSystem() {
		System.out.println("Thanks for utilizing my application. See you later. Press ENTER to exit.");
		Utilities.getScanner().nextLine();
		System.exit(0);
	}
}
