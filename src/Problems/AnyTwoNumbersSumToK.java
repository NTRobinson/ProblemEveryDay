package Problems;

import java.util.ArrayList;

public class AnyTwoNumbersSumToK 
{
	/*
	 This problem was recently asked by Google.

	Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

	For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

	Bonus: Can you do this in one pass?
	 */
	
	private ArrayList<Integer> list;
	
	public AnyTwoNumbersSumToK(ArrayList<Integer> l)
	{
		list = l;
	}
	
	public boolean check(int k) 
	{ // will tell you if any of the values in the list add up to k
		boolean good = false;
		
		for(int i = 0; i < list.size(); i++)
		{
			for(int j = i + 1; j < list.size(); j++)
			{
				if(list.get(i) + list.get(j) == k)
				{
					System.out.println(list.get(i) + " + " + list.get(j) + " = " + k);
					good = true;
					break;
				}
			}
			if (good == true)
			{
				System.out.println("Discontinuing search...");
				break;
			}
		}
		
		return good;
	}
}
