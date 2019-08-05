package Util;

public class BFSPoint 
{
	private int[] coord;
	private int dist;
	
	public BFSPoint(int[] c, int d)
	{
		coord = c;
		dist = d;
	}
	
	public int[] coord()
	{
		return coord;
	}
	
	public int dist()
	{
		return dist;
	}
	
	public void setDist(int d)
	{
		dist = d;
	}
}
