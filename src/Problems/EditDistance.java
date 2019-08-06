package Problems;

public class EditDistance 
{
	/*
	 	The edit distance between two strings refers to the minimum number of character insertions,
	 	deletions, and substitutions required to change one string to the other. For example, the
	 	edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute
	 	the “e” for “i”, and append a “g”.

		Given two strings, compute the edit distance between them.
	 */
	
	public EditDistance(){}
	
	public int distance(String s_1, String s_2)
	{ // computes edit distance
		int dist = 0;
		// add append distance
		dist = dist + Math.abs(s_1.length() - s_2.length());
		
		int min_len = 0;
		if(s_1.length() > s_2.length())
		{
			min_len = s_2.length();
		}
		else if(s_1.length() < s_2.length())
		{
			min_len = s_1.length();
		}
		else
		{ // they're equal
			min_len = s_2.length();
		}
		
		for(int i = 0; i < min_len; i++)
		{
			if(s_1.charAt(i) != s_2.charAt(i))
			{
				dist++;
			}
		}
		
		return dist;
	}
}
