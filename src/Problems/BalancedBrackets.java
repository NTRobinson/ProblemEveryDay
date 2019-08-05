package Problems;

import java.util.ArrayList;
import java.util.Stack;

import Util.Bracket;

public class BalancedBrackets 
{
	/*
		Given a string of round, curly, and square open and closing brackets, 
		return whether the brackets are balanced (well-formed).

		For example, given the string "([])[]({})", you should return true.

		Given the string "([)]" or "((()", you should return false.
	 */
	
	private String test;
	private Stack<Bracket> chars;
	
	public BalancedBrackets()
	{
		chars = new Stack<Bracket>();
	}
	
	public boolean test(String t)
	{
		// return FALSE if: 1. start with right side bracket 2. does not have a pair 3. pair contains a part of another pair
		test = t;
		
		boolean balanced = true;
		for(int i = 0; i < test.length(); i++)
		{ // fill the stack up
			Bracket b = new Bracket(test.charAt(i));
			if(b.isLeft())
			{
				chars.push(b);
			}
			else
			{ // check top of stack and see if they are a pair
				if(chars.isEmpty())
				{
					balanced = false;
					break;
				}
				
				if(isPair(chars.peek().getChar(), b.getChar()))
				{ // check to see if matches top of stack, continue
					chars.pop();
				}
				else
				{ // doesn't match, not balanced
					balanced = false;
					break;
				}
			}
		}
		
		if(!chars.isEmpty())
		{
			balanced = false;
		}
		
		return balanced;
	}
	
	private boolean isPair(char c_one, char c_two)
	{
		boolean isPair = false;
		
		if(c_one == '(')
		{
			if(c_two == ')')
			{
				isPair = true;
			}
		}
		if(c_one == '[')
		{
			if(c_two == ']')
			{
				isPair = true;
			}
		}
		if(c_one == '{')
		{
			if(c_two == '}')
			{
				isPair = true;
			}
		}
		return isPair;
	}
}
