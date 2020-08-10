import java.util.ArrayList;

public class Branch {

	private ArrayList<Customer> customerList;
	private String name;
	
	private Customer tmpCustomer;
	
	public Branch(String name) {
		this.name = name;
		customerList = new ArrayList<>();
		tmpCustomer = new Customer();
	}
	
	public Branch() {
		this("Default branch name");
	}
	
	public void addCustomer() {
		String customerName = Utilities.readStringInput("Enter new customer name: ");
		
		tmpCustomer = new Customer(customerName);
		customerList.add(tmpCustomer);
		
		addTransaction(tmpCustomer);
	}
	
	private void addTransaction(Customer tmpCustomer) {
		double transaction = Utilities.readDouble("Enter transaction amount: ");
		
		tmpCustomer.getTransactionList().add(transaction);
	}
	
	public void addTransaction() {
		 printListOfCustomers();
		 
		 int customerNumber = Utilities.readInteger("Enter customer number: ");
		 
		 if(customerNumber > 0 && customerNumber <= customerList.size()) {
			 addTransaction(customerList.get(customerNumber-1));
		 }
		 else {
			 System.out.println("Customer not found. Please try again.");
			 return;
		 }
	}
	
	public ArrayList<Customer> getCustomerList() {
		return this.customerList;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printListOfCustomers() {
		int customerNumber = 0;
		
		System.out.printf("%-10s %-30s\n", "Number", "Customer Name");
		for(Customer c : customerList) {
			Utilities.printFormatted(customerNumber+1, c.getCustomerName());
			customerNumber++;
			c.showTransactionList();
		}
	}
}
