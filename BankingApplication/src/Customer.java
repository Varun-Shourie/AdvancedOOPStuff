import java.util.ArrayList;

public class Customer {

	private ArrayList<Double> transactionList;
	private String customerName;
	
	public Customer(String customerName) {
		this.customerName = customerName;
		transactionList = new ArrayList<>();
	}
	
	public Customer() {
		this("John Doe");
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public ArrayList<Double> getTransactionList() {
		return this.transactionList;
	}
	
	public void showTransactionList() {
		Utilities.printFormatted("Amount:");
		for(Double d : transactionList) {
			Utilities.printFormatted(d);
		}
	}
}
