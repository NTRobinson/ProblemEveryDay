package Driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import Problems.AnyTwoNumbersSumToK;
import Problems.ClassroomLectures;
import Problems.CountUnivalSubtrees;
import Problems.FindIntersectingNodeLL;
import Tree.ManualBinaryTree;

public class Driver 
{
	public static void main(String[] args)
	{
		classroomLectures();
		
		//intersectingLinks();
		//univalTrees();
		//any2(Integer.parseInt(args[0]));
	}
	
	public static void classroomLectures()
	{
		ArrayList<int[]> time_intervals = new ArrayList<int[]>();
		int[] i_1 = new int[2];
		i_1[0] = 0;
		i_1[1] = 50;
		time_intervals.add(i_1);
		
		int[] i_2 = new int[2];
		i_2[0] = 30;
		i_2[1] = 75;
		time_intervals.add(i_2);
		
		int[] i_3 = new int[2];
		i_3[0] = 60;
		i_3[1] = 150;
		time_intervals.add(i_3);
		
		int[] i_4 = new int[2];
		i_4[0] = 10;
		i_4[1] = 87;
		time_intervals.add(i_4);
		
		int[] i_5 = new int[2];
		i_5[0] = 100;
		i_5[1] = 120;
		time_intervals.add(i_5);
		
		int[] i_6 = new int[2];
		i_6[0] = 40;
		i_6[1] = 80;
		time_intervals.add(i_6);
		
		int[] i_7 = new int[2];
		i_7[0] = 150;
		i_7[1] = 200;
		time_intervals.add(i_7);
		
		ClassroomLectures cl = new ClassroomLectures(time_intervals);
		int num_rooms = cl.numRoomsRequired();
		System.out.println("Number of rooms required: " + num_rooms);
	}
	
	public static void intersectingLinks()
	{ // assuming that the LLs are of equal length
		LinkedList<Integer> ll_one = new LinkedList<Integer>();
		LinkedList<Integer> ll_two = new LinkedList<Integer>();
		
		ll_one.add(3);
		ll_one.add(7);
		ll_one.add(8);
		ll_one.add(10);
		
		ll_two.add(99);
		ll_two.add(1);
		ll_two.add(8);
		ll_two.add(10);
		
		for(Integer i : ll_one)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		for(Integer i: ll_two)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		
		FindIntersectingNodeLL fi = new FindIntersectingNodeLL(ll_one, ll_two);
		System.out.println("Intersection point: " + fi.findIntersection());
	}
	
	public static void univalTrees()
	{
		ManualBinaryTree mbt = new ManualBinaryTree();
		mbt.setUpExampleTree();
		
		CountUnivalSubtrees cus = new CountUnivalSubtrees(mbt);
		
		int count = cus.count();
		System.out.println("Unival Trees: " + count);
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
