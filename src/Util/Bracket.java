package Util;

public class Bracket 
{
	private char bracket;
	
	public Bracket(char c)
	{
		bracket = c;
	}
	
	public char getChar()
	{
		return bracket;
	}
	
	public boolean isLeft()
	{
		boolean isLeft = false;
		if(bracket == '{')
		{
			isLeft = true;
		}
		else if(bracket == '(')
		{
			isLeft = true;
		}
		else if(bracket == '[')
		{
			isLeft = true;
		}
		
		return isLeft;
	}
	
	public boolean isRight()
	{
		boolean isRight = false;
		if(bracket == '}')
		{
			isRight = true;
		}
		else if(bracket == ')')
		{
			isRight = true;
		}
		else if(bracket == ']')
		{
			isRight = true;
		}
		
		return isRight;
	}
}
