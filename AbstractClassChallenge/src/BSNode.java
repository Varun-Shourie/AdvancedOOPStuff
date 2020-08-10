
public class BSNode extends ListItem {
	
	private BSNode parentNode;

	public BSNode(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(ListItem itemTwo) {
		// TODO Auto-generated method stub
		return getValue().compareTo(itemTwo.getValue());
	}
	
	public BSNode getParentNode() {
		return parentNode;
	}
	
	public void setParentNode(BSNode parentNode) {
		this.parentNode = parentNode;
	}
}
