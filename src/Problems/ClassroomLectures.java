package Problems;

import java.util.ArrayList;

import Util.Room;

public class ClassroomLectures 
{
	/* Given an array of time intervals (start, end) for classroom lectures (possibly overlapping)
	 * , find the minimum number of rooms required.
	 * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
	 */
	
	ArrayList<int[]> time_intervals;
	
	public ClassroomLectures(ArrayList<int[]> ti)
	{
		time_intervals = ti;
	}
	
	public int numRoomsRequired()
	{
		int count = 1;
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(new Room());
		
		for(int[] interval: time_intervals)
		{ // need to try adding the time intervals, if they overlap with a previously added then add to count
			boolean added = false;
			System.out.println("Adding [" + interval[0] + ", " + interval[1] + "]");
			
			for(Room r : rooms)
			{
				if(r.checkAvailability(interval) == true)
				{ // we can add a class!
					r.addClass(interval);
					added = true;
				}
			}
			if(added == false)
			{
				System.out.println("Need a new room.");
				count++;
				rooms.add(new Room());
				
				for(Room r : rooms)
				{
					if(r.checkAvailability(interval) == true)
					{ // we can add a class!
						r.addClass(interval);
						added = true;
					}
				}
			}
		}
		
		return count;
	}
}
