package Problems;

import java.util.LinkedList;

public class FindIntersectingNodeLL {
	/*
	For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

	In this example, assume nodes with the same value are the exact same node objects.

	Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
	*/
	
	LinkedList<Integer> ll_one;
	LinkedList<Integer> ll_two;
	
	public FindIntersectingNodeLL(LinkedList<Integer> one, LinkedList<Integer> two)
	{
		ll_one = one;
		ll_two = two;
	}
	
	public int findIntersection()
	{ // only one traversal of each list O(N + M) time
		int intersecting = -1;
		
		for(int n = 0; n < ll_one.size(); n++)
		{
			if(ll_one.get(n) == ll_two.get(n))
			{
				intersecting = ll_one.get(n);
				break;
			}
		}
		
		return intersecting;
	}
}
