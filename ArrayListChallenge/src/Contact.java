import java.util.ArrayList;

public class Contact {

	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact() {
		this("John Doe", "623-345-7890");
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
