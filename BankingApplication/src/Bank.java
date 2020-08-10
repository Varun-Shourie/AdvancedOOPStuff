import java.util.ArrayList;

public class Bank {

	private String bankName;
	private ArrayList<Branch> branchList; 
	private Branch tmpBranch;
	
	public Bank(String bankName) {
		this.bankName = bankName;
		branchList = new ArrayList<>();
		tmpBranch = new Branch();
	}
	
	public Bank() {
		this("Chase Bank");
	}
	
	public void addBranch() {
		System.out.println("Bank --> Adding branch.\n");
		
		String bankBranch = Utilities.readStringInput("Please enter new bank branch name: ");
		tmpBranch = new Branch(bankBranch);
		branchList.add(tmpBranch);
		
		tmpBranch.addCustomer();
	}
	
	public void addCustomer() {
		tmpBranch = referToBranch();
		tmpBranch.addCustomer();
	}
	
	public void addTransaction() {
		tmpBranch = referToBranch();
		
		if(tmpBranch == null)
			return;
		
		tmpBranch.addTransaction();
	}
	
	public ArrayList<Branch> getBranchList() {
		return this.branchList;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	private Branch referToBranch() {
		showBranchList();
		System.out.println();
		
		int branchNumber = Utilities.readInteger("Enter branch number: ");
		
		if(branchNumber > 0 && branchNumber <= branchList.size()) {
			tmpBranch = branchList.get(branchNumber-1);
			return tmpBranch;
		}
		else {
			System.out.println("This branch does not exist. Please try again.");
			return null;
		}
	}
	
	public void showBranchList() {
		System.out.printf("%-10s %-30s\n", "Number", "Branch Name");
		
		int branchNumber = 0;
		
		for(Branch b : branchList) {
			Utilities.printFormatted(branchNumber+1, b.getName());
			branchNumber++;
		}
	}
	
	public void showCustomersInBranches() {
		for(Branch b : branchList) {
			System.out.println("\t\t" + b.getName() + "\n");
			
			System.out.print("Customers: \n");
			for(Customer c : b.getCustomerList()) {
				System.out.println(c.getCustomerName());
			}
		}
	}
}
