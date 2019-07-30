package Tree;

public class Node 
{ // generic node class, does not enforce 
	private int value;
	private Node parent;
	private Node left_node;
	private Node right_node;
	
	private boolean isRoot;
	private boolean visited;
	
	public Node(int v, Node p)
	{
		value = v;
		parent = p;
		left_node = null;
		right_node = null;
		visited = false;
		isRoot = false;
	}
	public void setRoot(boolean r)
	{
		isRoot = r;
	}
	public boolean isRoot()
	{
		return isRoot;
	}
	public int value()
	{
		return value;
	}
	public void visited()
	{
		visited = true;
	}
	public void setLeftChild(Node n)
	{ // should always be able to add nodes to the left side, just need to maintain binary structure
		left_node = n;
	}
	public void setRightChild(Node n)
	{
		right_node = n;
	}
	public Node getLeftChild()
	{
		return left_node;
	}
	public Node getRightChild()
	{
		return right_node;
	}
	public Node getParent()
	{
		return parent;
	}
	public boolean hasLeftChild()
	{
		boolean test = false;
		if(left_node != null)
		{
			test = true;
		}
		return test;
	}
	public boolean hasRightChild()
	{
		boolean test = false;
		if(right_node != null)
		{
			test = true;
		}
		return test;
	}
}
