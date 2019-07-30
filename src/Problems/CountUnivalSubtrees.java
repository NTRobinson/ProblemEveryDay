package Problems;

import java.util.ArrayList;

import Tree.ManualBinaryTree;
import Tree.Node;

public class CountUnivalSubtrees 
{
	/*
 	A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

	Given the root to a binary tree, count the number of unival subtrees.
	
	For example, the following tree has 5 unival subtrees:
	
	   0
	  / \
	 1   0
	    / \
	   1   0
	  / \
	 1   1
	 */
	
	private ManualBinaryTree mbt;
	private ArrayList<Node> nodes;
	
	private ArrayList<Node> sub_nodes;
	
	public CountUnivalSubtrees(ManualBinaryTree t)
	{
		mbt = t;
		nodes = new ArrayList<Node>();
	}
	
	public int count()
	{
		int count = 0;
		Node root = mbt.getRoot();
		inOrderTraversal(root);
		
		for(Node n : nodes)
		{
			if(isUnivalTree(n))
			{
				count++;
			}
		}
		
		return count;
	}
	
	private boolean isUnivalTree(Node test)
	{ // basically, perform an in-order traversal 
		boolean unival = true;
		int test_value = test.value();
		sub_nodes = new ArrayList<Node>();
		inOrderSubTree(test);
		for(Node n : sub_nodes)
		{
			if(n.value() != test_value)
			{
				unival = false;
			}
		}
		
		return unival;
	}
	private void inOrderSubTree(Node test)
	{
		if(test != null)
		{
			inOrderSubTree(test.getLeftChild());
			sub_nodes.add(test);
			inOrderSubTree(test.getRightChild());
		}
	}
	
	private void inOrderTraversal(Node current)
	{
		if(current != null)
		{
			inOrderTraversal(current.getLeftChild());
			System.out.println(current.value());
			nodes.add(current);
			inOrderTraversal(current.getRightChild());
		}
	}
}