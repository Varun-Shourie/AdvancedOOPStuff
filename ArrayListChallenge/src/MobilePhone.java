import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	private ArrayList<Contact> contactList;
	private Contact tmpContact;
	private static Scanner scanner;
	
	public MobilePhone() {
		contactList = new ArrayList<>();
		tmpContact = new Contact();
		scanner = new Scanner(System.in);
	}
	
	public void addNewContact() {
		
		System.out.println("Mobile Phone - Add New Contact\n");
		
		String contactName = "";
		String contactPhone = "";
		
		System.out.print("Enter new contact's name: ");
		contactName = scanner.nextLine();
		
		System.out.print("Enter new contact's phone number: ");
		contactPhone = scanner.nextLine();
		
		if(findContact(contactName) == -1) {
			tmpContact = new Contact(contactName, contactPhone);
			contactList.add(tmpContact);
		}
		else 
			System.out.println("Contact already exists. Please add a new contact to your contact list.");
	}
	
	private int findContact(String contactName) {
		
		int contactNumber = 0;
		
		for(Contact c : contactList) {
			if(c.getName().equalsIgnoreCase(contactName)) {
				return contactNumber;
			}
			
			contactNumber++;
		}
		
		// Used to denote that the name was not found in the mobile phone's contact list. 
		return -1;
	}
	
	public void printContacts() {
		
		System.out.println("Mobile Phone - Contact List\n");
		
		printFormatted("Name", "Phone Number");
		
//		for(int i = 0; i < contactList.size(); i++) {
//			printFormatted(contactList.get(i).getName(), contactList.get(i).getPhoneNumber());
//		}
		
		for(Contact c : contactList) {
			printFormatted(c.getName(), c.getPhoneNumber());
		}
	}
	
	private static void printFormatted(String string1, String string2) {
		System.out.printf("%-25s %-15s\n", string1, string2);
	}
	
	public void removeContact() {
		String contactName = "";
		int contactPosition = 0;
		
		System.out.println("Mobile Phone - Remove Contact\n");
		
		System.out.print("Enter contact name: ");
		contactName = scanner.nextLine();
		
		contactPosition = findContact(contactName);
		System.out.println();
		
		
	}
	
	public void searchContact() {
		
		String contactName = "";
		int contactPosition = 0;
		
		System.out.println("Mobile Phone - Search for Contact\n");
		
		System.out.print("Enter contact's name: ");
		contactName = scanner.nextLine();
		
		contactPosition = findContact(contactName);
		System.out.println();
		
		if(contactPosition != -1) {
			tmpContact = contactList.get(contactPosition);
			
			printFormatted("Name", "Phone Number");
			printFormatted(tmpContact.getName(), tmpContact.getPhoneNumber());
		}
		else
			System.out.println("No contacts were found according to the search criterion. Please try again.");
	}
	
	public void updateContact() {
		
		String contactName = "";
		int contactPosition = 0;
		String contactPhone = "";
		
		System.out.println("Mobile Phone - Update Existing Contact\n");
		
		System.out.print("Enter contact's name: ");
		contactName = scanner.nextLine();
		
		contactPosition = findContact(contactName);
		System.out.println();
		
		if(contactPosition != -1) {
			tmpContact = contactList.get(contactPosition);
			
			System.out.print("Enter updated contact name: ");
			contactName = scanner.nextLine();
			tmpContact.setName(contactName);
			
			System.out.print("Enter updated contact phone number: ");
			contactPhone = scanner.nextLine();
			tmpContact.setPhoneNumber(contactPhone);
		}
		else 
			System.out.println("No contacts were found according to the search criterion. Please try again.");
	}
}
