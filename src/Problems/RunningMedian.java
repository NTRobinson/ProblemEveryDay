package Problems;

import java.util.ArrayList;
import java.util.Collections;

public class RunningMedian 
{
	/*
	 	Compute the running median of a sequence of numbers. That is, given a stream of numbers, 
	 	print out the median of the list so far on each new element.

		Recall that the median of an even-numbered list is the average of the two middle numbers.
	 */
	
	private ArrayList<Integer> numbers;
	
	public RunningMedian()
	{
		numbers = new ArrayList<Integer>();
	}
	
	public float addNumber(int num)
	{
		float median = 0;
		
		numbers.add(num);
		Collections.sort(numbers);
		
		if(numbers.size()%2 == 0)
		{ //check if size even (two terms)
			int left = numbers.get(numbers.size()/2 - 1);
			int right = numbers.get(numbers.size()/2);
			median = (float) (left+right)/2;
		}
		else
		{ //else odd
			median = numbers.get(numbers.size()/2);
		}
		
		return median;
	}
}
