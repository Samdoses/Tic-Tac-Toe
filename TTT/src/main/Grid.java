package main;

public class Grid {
	//Representing the TTT grid as a 2d integer array 
	int[][] grid;
	
	// For Marking a unoccupied location.
	private static final int EMPTY = 0;
	// For marking a player occupied location.
	private static final int PLAYER = 1;
	
	public Grid(int size) {
		grid = new int[size][size];
		
		for(int row=0;row<size;row++) {
			for(int collumn=0; collumn<size;collumn++) {
				grid[row][collumn] = EMPTY;	
			}
		}
	}
	
	//in the future another parameter is needed to understand if it is for player or computer
	public void selectCell(int row, int collumn){
		
		if(grid[row-1][collumn-1] != EMPTY) {
			throw new OccupationException ();
		}
		else {
			grid[row-1][collumn-1] = PLAYER;
		}
	}
	
	//checks if the player has won
	public boolean win() {
		
		int count=0;
		
		for(int row=0;row<grid.length;row++) {
			for(int collumn=0; collumn<grid.length;collumn++) {
				if(grid[row][collumn] == 1) {
					count++;
				}
			}
		}
		
		if(count == (grid.length)) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		String result = "";
		
		for(int row=0;row<grid.length;row++) {
			for(int collumn=0; collumn<grid.length;collumn++) {
				result += grid[row][collumn];	
			}
			result += "\n";
		}
		
		return result;
	}
}
