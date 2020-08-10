
public class Item extends ListItem {

	public Item(String value) {
		super(value);
	}

	// Compares two strings and provides a value which flags whether it 
	// should be added before, after, or in the same position as the
	// current item. 
	@Override
	public int compareTo(ListItem itemTwo) {
		// TODO Auto-generated method stub
		return getValue().compareTo(itemTwo.getValue());
	}

}
