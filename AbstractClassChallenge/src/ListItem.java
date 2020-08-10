/**
 * 
 * @author svaru
 * Writing a generic item which can be modeled in my own self-made LinkedList class. 
 *
 */
public abstract class ListItem {

	private ListItem previousItem;
	private ListItem nextItem;
	private String value;
	
	public ListItem(String value) {
		this.value = value;
	}
	
	public abstract int compareTo(ListItem itemTwo);
	
	public ListItem getPreviousItem() {
		return previousItem;
	}
	
	public ListItem getNextItem() {
		return nextItem;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setPreviousItem(ListItem previousItem) {
		this.previousItem = previousItem;
	}
	
	public void setNextItem(ListItem nextItem) {
		this.nextItem = nextItem;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
