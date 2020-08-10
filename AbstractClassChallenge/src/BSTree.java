import java.util.ArrayList;

public class BSTree {
	
	private BSNode root;
	private ArrayList<BSNode> bsTree;
	
	public BSTree(String rootName) {
		bsTree = new ArrayList<>();
		root = new BSNode(rootName);
	}
	
	public void addInOrder(BSNode node) {
		BSNode tmpNode = root;
		
		while(true) {
			if(tmpNode.compareTo(node) < 0 && tmpNode.getNextItem() == null) {
				bsTree.add(node);
				tmpNode.setNextItem(node);
				
				System.out.println("Adding " + node.getValue() + " to the right of " + tmpNode.getValue() + ".");
				break;
			}
			else if(tmpNode.compareTo(node) >= 0 && tmpNode.getPreviousItem() == null) {
				bsTree.add(node);
				tmpNode.setPreviousItem(node);
				
				System.out.println("Adding " + node.getValue() + " to the left of " + tmpNode.getValue() + ".");
				break;
			}
			else if(tmpNode.compareTo(node) < 0) {
				tmpNode = (BSNode) tmpNode.getNextItem();
			}
			else if(tmpNode.compareTo(node) >= 0) {
				tmpNode = (BSNode) tmpNode.getPreviousItem();
			}
		}
	}
	
	public BSNode findNode(String nodeValue) {
		for(BSNode node : bsTree) {
			if(node.getValue().equals(nodeValue)) {
				return node;
			}
		}
		
		return null;
	}
	
	public void removeNode(String nodeValue) {
		BSNode node = findNode(nodeValue);
		
		// For the root node
		if(node.getPreviousItem() == null && node.getNextItem() == null) {
			bsTree.remove(node);
			System.out.println("The root " + node.getValue() + " has been removed from the binary search tree.");
		}
		else {
			// Represents the right most element in either the left or right sub-tree. 
			if(node.getPreviousItem() != null && node.getNextItem() == null) {
				bsTree.remove(node);
			}
			// Represents the left most element in either the left or right sub-tree. 
			else if(node.getPreviousItem() == null && node.getNextItem() != null) {
				bsTree.remove(node);
			}
			// Represents an element which has two nodes to the left and right of it. 
			else {
				
			}
		}
	}
}
