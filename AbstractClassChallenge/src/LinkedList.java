import java.util.ArrayList;

public class LinkedList {

	private ArrayList<Item> linkedList;
	
	public LinkedList() {
		linkedList = new ArrayList<>();
	}
	
	public void addInOrder(Item item) {
		Item tmpItem = null;
		int comparison = 0;
		
		if(linkedList.isEmpty()) {
			System.out.println("Adding item " + item.getValue() + " to an empty linked list.");
			linkedList.add(item);
		}
		else {
			int minimumComparison = findFirstElement().compareTo(item);
			int maximumComparison = findLastElement().compareTo(item);
			
			while(true) {
				// The first element supersedes the item to be inserted lexicographically.
				if(minimumComparison > 0) {
					linkedList.add(item);
					
					tmpItem = findFirstElement();
					tmpItem.setPreviousItem(item);
					item.setNextItem(tmpItem);
					
					System.out.println("Adding item " + item.getValue() + " before the "
							+ "first element in the list.");
					break;
				}
				// The item to be added supersedes the last element in the list. 
				else if(maximumComparison < 0) {
					linkedList.add(item);
					
					tmpItem = findLastElement();
					tmpItem.setNextItem(item);
					item.setPreviousItem(tmpItem);
					
					System.out.println("Adding item " + item.getValue() + " after the " +
							"final element in the list.");
					break;
				}
				// The item to be added is in between the first and last element. 
				else {
					tmpItem = findMatchingElement(item);
					
					Item nextItem = (Item) tmpItem.getNextItem();
					nextItem.setPreviousItem(item);
					tmpItem.setNextItem(item);
					
					item.setPreviousItem(tmpItem);
					item.setNextItem(nextItem);
					
					System.out.println("Adding " + item.getValue() + " in between " +
							tmpItem.getValue() + " and " + nextItem.getValue());
					break;
				}
			}
		}
	}
	
	
	
	public ArrayList<Item> getLinkedList() {
		return linkedList;
	}
	
	private Item findFirstElement() {
		
		for(Item li : linkedList) {
			if(li.getPreviousItem() == null) 
				return li;
		}
		
		return null;
	}
	
	private Item findElement(String item) {
		for(Item i : linkedList) {
			if(i.getValue().equals(item)) {
				return i;
			}
		}
		
		return null;
	}
	
	private Item findLastElement() {
		
		for(Item li: linkedList) {
			if(li.getNextItem() == null) 
				return li;
		}
		
		return null;
	}
	
	private Item findMatchingElement(Item item) {
		Item tmpItem = findFirstElement();
		
		// Returns an element which is lexicographically behind the item to be added.
		while(true) {
			 if((tmpItem.getNextItem() != findLastElement()) && tmpItem.getNextItem().compareTo(item) < 0) {
				 tmpItem = (Item) tmpItem.getNextItem();
			 }
			 else {
				 break;
			 }
		}
		
		return tmpItem;
	}
	
	public void printString() {
		Item item = findFirstElement();
		System.out.print(item.getValue() + " ");
		
		while(true) {
			if(item.getNextItem() != null) {
				item = (Item) item.getNextItem();
				System.out.print(item.getValue() + " ");
			}
			else {
				System.out.print("\n");
				break;
			}
		}
	}
	
	public void removeItem(String item) {
		Item futureDeletion = findElement(item);
		Item tmpItem = null;
		Item tmpItem2 = null;
		
		if(futureDeletion == null) {
			System.out.println("No item was found matching the search criteria.");
		}
		else if(futureDeletion == findFirstElement()) {
			tmpItem = (Item) futureDeletion.getNextItem();
			tmpItem.setPreviousItem(null);
		}
		else if(futureDeletion == findLastElement()) {
			tmpItem = (Item) futureDeletion.getPreviousItem();
			tmpItem.setNextItem(null);
		}
		else {
			tmpItem = (Item) futureDeletion.getPreviousItem();
			tmpItem2 = (Item) futureDeletion.getNextItem();
			
			tmpItem.setNextItem(tmpItem2);
			tmpItem2.setPreviousItem(tmpItem);
		}
		
		System.out.println("Removing " + futureDeletion.getValue() + " from the list.");
		linkedList.remove(futureDeletion);
	}
	
	public void setLinkedList(ArrayList<Item> linkedList) {
		this.linkedList = linkedList;
	}
	
	
}
