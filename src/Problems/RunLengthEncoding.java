package Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RunLengthEncoding 
{
	/*
	 	Run-length encoding is a fast and simple method of encoding strings. 
	 	The basic idea is to represent repeated successive characters as a 
	 	single count and character. For example, the string "AAAABBBCCDAA" 
	 	would be encoded as "4A3B2C1D2A".

		Implement run-length encoding and decoding. You can assume the string
		to be encoded have no digits and consists solely of alphabetic 
		characters. You can assume the string to be decoded is valid.
	 */
	
	public RunLengthEncoding(){}
	
	public String encode(String s)
	{
		String ns = "";
		
		Queue<Character> q = new LinkedList<Character>();
		for(int i = 0; i < s.length(); i++)
		{
			q.add(s.charAt(i));
		}
		
		int count = 1;
		
		for(int i = 0; i < s.length(); i++)
		{
			char curr = q.remove();
			if(!q.isEmpty())
			{
				if(curr == q.peek())
				{
					count++;
				}
				else
				{
					ns = ns + Integer.toString(count) + curr;
					count = 1;
				}
			}
			else
			{
				ns = ns + Integer.toString(count) + curr;
			}
		}
		
		
		return ns;
	}
	
	public String decode(String s)
	{
		String ns = "";
		
		for(int i = 0; i < s.length(); i = i + 2)
		{
			int num = Integer.parseInt(Character.toString(s.charAt(i)));
			char curr_char = s.charAt(i+1);
			for(int j = 0; j < num; j++)
			{
				ns = ns + curr_char;
			}
		}
		
		return ns;
	}
}
