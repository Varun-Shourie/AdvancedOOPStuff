
public class Main {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		String stringData = "Hello Alfonso Mango Burger Irving";
		String[] data = stringData.split(" ");
		
		for(String s : data) {
			linkedList.addInOrder(new Item(s));
		}
		
		linkedList.printString();
		
		linkedList.removeItem("Hello");
		
		BSTree bsTree = new BSTree("Queen");
		bsTree.addInOrder(new BSNode("King"));
		bsTree.addInOrder(new BSNode("Ace"));
		bsTree.addInOrder(new BSNode("Spade"));
		bsTree.addInOrder(new BSNode("Kite"));
		bsTree.addInOrder(new BSNode("Rain"));
		bsTree.addInOrder(new BSNode("Taste"));
	}
}
