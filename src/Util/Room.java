package Util;

import java.util.ArrayList;

public class Room 
{
	public ArrayList<int[]> scheduled_classes;
	
	public Room()
	{
		scheduled_classes = new ArrayList<int[]>();
	}
	
	public boolean checkAvailability(int[] test)
	{
		boolean can_fit = true;
		for(int[] ti : scheduled_classes)
		{
			// is the start time in between currently scheduled class?
			if (test[0] >= ti[0] && test[0] < ti[1])
			{
				can_fit = false;
			}
			
			// is the end time in between currently scheduled class?
			if (test[1] <= ti[1] && test[1] >= ti[0])
			{
				can_fit = false;
			}
			
			if(test[0] < ti[0] && test[1] > ti[1])
			{
				can_fit = false;
			}
		}
		
		return can_fit;
	}
	
	public boolean addClass(int[] to_add)
	{
		boolean added = false;
		if(checkAvailability(to_add) == true)
		{
			scheduled_classes.add(to_add);
			added = true;
		}
		
		return added;
	}
}
