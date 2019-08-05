package Problems;

import java.util.LinkedList;
import java.util.Queue;

import Util.BFSPoint;

public class MinNumStepsBoard 
{
	/*
		You are given an M by N matrix consisting of booleans that represents a board.
		Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

		Given this matrix, a start coordinate, and an end coordinate, return the minimum number
		of steps required to reach the end coordinate from the start. If there is no possible path,
		then return null. You can move up, left, down, and right. You cannot move through walls. 
		You cannot wrap around the edges of the board.

		For example, given the following board:

		[[f, f, f, f],
		[t, t, f, t],
		[f, f, f, f],
		[f, f, f, f]]
		and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps
		required to reach the end is 7, since we would need to go through (1, 2) because there is
		a wall everywhere else on the second row.
	*/
	private boolean[][] board;
	private boolean[][] visited;	
	private int rows;
	private int cols;
	
	private Queue<BFSPoint> q;
	
	public MinNumStepsBoard(boolean[][] b, int c, int r)
	{
		board = b;
		cols = c;
		rows = r;
		q = new LinkedList<>();
		visited = new boolean[c][r];
		visited[0][0] = false;
		visited[0][1] = false;
		visited[0][2] = false;
		visited[0][3] = false;
		
		visited[1][0] = false;
		visited[1][1] = false;
		visited[1][2] = false;
		visited[1][3] = false;
		
		visited[2][0] = false;
		visited[2][1] = false;
		visited[2][2] = false;
		visited[2][3] = false;
		
		visited[3][0] = false;
		visited[3][1] = false;
		visited[3][2] = false;
		visited[3][3] = false;

	}
	
	public int minNumSteps(int[] start_coord, int[] end_coord)
	{ // false means we can walk on the tile
		System.out.println("Initiate!");
		
		q.add(new BFSPoint(start_coord, 0));
		
		// for our loop in BFS search to get neighbors of current cell
		int rowNum[] = {-1, 0, 1, 0}; 
		int colNum[] = {0, 1, 0, -1}; 
		
		while(!q.isEmpty())
		{
			BFSPoint curr = q.peek();
			
			if(curr.coord()[0] == end_coord[0] && curr.coord()[1] == end_coord[1])
			{ // we've reached the end
				return curr.dist();
			}
			
			q.remove();
			
			for(int i = 0; i < 4; i++)
			{
				int[] new_coord = new int[2];
				new_coord[0] = curr.coord()[0] + rowNum[i];
				new_coord[1] = curr.coord()[1] + colNum[i];
				
				if(validate(new_coord) && !board[new_coord[0]][new_coord[1]] && !visited[new_coord[0]][new_coord[1]])
				{ // if adjacent cell is valid, has not been visited and is not a wall, enqueue
					BFSPoint new_point = new BFSPoint(new_coord, curr.dist() + 1);
					q.add(new_point);
					
					visited[new_coord[0]][new_coord[1]] = true;
				}
			}
		}
		
		return -1;
	}
	
	private boolean validate(int[] coord)
	{
		boolean valid = false;
		
		if((coord[0] >= 0) && (coord[0] < rows))
		{
			if((coord[1] >= 0) && (coord[1] < cols))
			{
				valid = true;
			}
		}
		return valid;
	}
}
