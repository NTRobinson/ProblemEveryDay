package Tree;

public class ManualBinaryTree 
{ // weird tree structure from a practice problem in which values can only be 0 or 1
	private Node root;
	private Node current;
	
	public ManualBinaryTree()
	{
		root = null;
		current = root;
	}
	public Node getRoot()
	{
		return root;
	}
	
	public void setUpExampleTree()
	{
		current = new Node(0, null);
		root = current;
		root.setRoot(true);
		current.setLeftChild(new Node(1, root));
		current.setRightChild(new Node (0, root));
		
		current = current.getRightChild();
		current.setLeftChild(new Node(1, root));
		current.setRightChild(new Node (0, root));
		
		current = current.getLeftChild();
		current.setLeftChild(new Node(1, root));
		current.setRightChild(new Node (1, root));
		
		current = current.getParent();
		current = current.getRightChild();
		current.setRightChild(new Node (0, root));
		
		current = root;
	}
}
