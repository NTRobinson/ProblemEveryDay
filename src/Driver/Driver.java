package Driver;

import java.util.ArrayList;
import java.util.Random;

import Problems.AnyTwoNumbersSumToK;

public class Driver 
{
	public static void main(String[] args)
	{
		any2(Integer.parseInt(args[0]));
	}
	
	public static void any2(int k)
	{ // Given a list of numbers (in this case, randomly generated), and a number k, return whether any two numbers from the list add up to k.
		ArrayList<Integer> sample = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++)
		{
			Random rand = new Random();
			int random = rand.nextInt(10) + 1;
			
			sample.add(random);
		}
		
		for(int i : sample)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		int target_sum = k;
		AnyTwoNumbersSumToK any2 = new AnyTwoNumbersSumToK(sample);
		System.out.println("Two numbers add up to " + target_sum + ": " + any2.check(target_sum));
	}
}
