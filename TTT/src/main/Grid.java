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
		
		//MAKE CONDITION != 0 FOR COMPATABILITY WITH COMPUTER???
		
		//Checks if the user has a row to win
		for(int row=0;row<grid.length;row++) {
			if(grid[row][0] == PLAYER && grid[row][1] == PLAYER && grid[row][2] == PLAYER) {
				return true;
			}
		}
		
		//checks if the user has a column to win
		for(int collumn=0; collumn<grid.length;collumn++) {
			if(grid[0][collumn] == PLAYER && grid[1][collumn] == PLAYER && grid[2][collumn] == PLAYER) {
				return true;
			}
		}

		//checks if the user has a cross to win
		if(grid[0][0] == PLAYER && grid[1][1] == PLAYER && grid[2][2] == PLAYER ||
				grid[0][2] == PLAYER && grid[1][1] == PLAYER && grid[2][0] == PLAYER) {
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
