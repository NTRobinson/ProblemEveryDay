package Driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import Problems.AnyTwoNumbersSumToK;
import Problems.BalancedBrackets;
import Problems.ClassroomLectures;
import Problems.CountUnivalSubtrees;
import Problems.EditDistance;
import Problems.FindIntersectingNodeLL;
import Problems.MinNumStepsBoard;
import Problems.RunLengthEncoding;
import Problems.RunningMedian;
import Tree.ManualBinaryTree;

public class Driver 
{
	public static void main(String[] args)
	{
		runningMedian();
		
		//editDistance();
		//runLengthEncoding();
		//balancedBrackets();
		//minNumSteps();
		//classroomLectures();
		//intersectingLinks();
		//univalTrees();
		//any2(Integer.parseInt(args[0]));
	}
	
	public static void runningMedian()
	{
		RunningMedian rm = new RunningMedian();
		float median = 0;
		
		median = rm.addNumber(2);
		System.out.println(median);
		median = rm.addNumber(1);
		System.out.println(median);
		median = rm.addNumber(5);
		System.out.println(median);
		median = rm.addNumber(7);
		System.out.println(median);
		median = rm.addNumber(2);
		System.out.println(median);
		median = rm.addNumber(0);
		System.out.println(median);
		median = rm.addNumber(5);
		System.out.println(median);
	}
	
	public static void editDistance()
	{
		String s_1 = "kitten";
		String s_2 = "sitting";
		
		EditDistance ed = new EditDistance();
		System.out.println("Edit distance between \"" + s_1 + "\" and \'" + s_2 + "\": " + ed.distance(s_1, s_2));
	}
	
	public static void runLengthEncoding()
	{
		String raw_string = "AAAABBBCCDAA";
		String encoded_string = "4A3B2C1D2A";
		
		RunLengthEncoding rle = new RunLengthEncoding();
		System.out.println("Original: " + raw_string + " Encoded: " + rle.encode(raw_string));
		System.out.println("Original: " + encoded_string + "Decoded: " + rle.decode(encoded_string));
	}
	
	public static void balancedBrackets()
	{
		String s_1 = "([])[]({})";
		String s_2 = "([)]";
		String s_3 = "((()";
		
		BalancedBrackets bb = new BalancedBrackets();
		System.out.println("Test string " + s_1 + " is balanced: " + bb.test(s_1));
		System.out.println("Test string " + s_2 + " is balanced: " + bb.test(s_2));
		System.out.println("Test string " + s_3 + " is balanced: " + bb.test(s_3));
	}
	
	public static void minNumSteps()
	{
		//where top left of matrix is (0,0)
		boolean[][] board = new boolean[4][4];
		board[0][0] = false;
		board[0][1] = false;
		board[0][2] = false;
		board[0][3] = false;
		
		board[1][0] = true;
		board[1][1] = true;
		board[1][2] = false;
		board[1][3] = true;
		
		board[2][0] = false;
		board[2][1] = false;
		board[2][2] = false;
		board[2][3] = false;
		
		board[3][0] = false;
		board[3][1] = false;
		board[3][2] = false;
		board[3][3] = false;
		
		MinNumStepsBoard msb = new MinNumStepsBoard(board, 4, 4);
		int[] start_coord = new int[2];
		start_coord[0] = 3;
		start_coord[1] = 0;
		int[] end_coord = new int[2];
		end_coord[0] = 0;
		end_coord[1] = 0;
		int num_steps = msb.minNumSteps(start_coord, end_coord);
		
		System.out.println("Minimum number of steps: " + num_steps);
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
