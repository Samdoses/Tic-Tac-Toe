package main;

public class Grid {
	//Representing the TTT grid as a 2d integer array 
	int[][] grid;
	
	//The number of cells occupied
	private int count = 0;
	
	// For Marking a unoccupied location.
	private static final int EMPTY = 0;
	// For marking a player occupied location.
	private static final int PLAYER = 1;
	//For marking a opponent's location
	private static final int OPPONENT = 2;
	
	public Grid(int size) {
		grid = new int[size][size];
		
		for(int row=0;row<size;row++) {
			for(int collumn=0; collumn<size;collumn++) {
				grid[row][collumn] = EMPTY;	
			}
		}
	}
	
	//allows other classes to access the grid's occupier attributes
	public int getPlayer() {
		return PLAYER;
	}
	
	public int getOpponent() {
		return OPPONENT;
	}
	
	public int getCount() {
		return count;
	}
	
	
	//in the future another parameter is needed to understand if it is for player or computer
	public void selectCell(int row, int collumn, int entity){
		
		if(grid[row-1][collumn-1] != EMPTY) {
			throw new OccupationException ();
		}
		else {
			grid[row-1][collumn-1] = entity;
			count++;
		}
	}
	
	//checks if the player has won
	public boolean win(int entity) {
		
		//MAKE CONDITION != 0 FOR COMPATABILITY WITH COMPUTER???
		
		//Checks if the user has a row to win
		for(int row=0;row<grid.length;row++) {
			if(grid[row][0] == entity && grid[row][1] == entity && grid[row][2] == entity) {
				return true;
			}
		}
		
		//checks if the user has a column to win
		for(int collumn=0; collumn<grid.length;collumn++) {
			if(grid[0][collumn] == entity && grid[1][collumn] == entity && grid[2][collumn] == entity) {
				return true;
			}
		}

		//checks if the user has a cross to win
		if(grid[0][0] == entity && grid[1][1] == entity && grid[2][2] == entity ||
				grid[0][2] == entity && grid[1][1] == entity && grid[2][0] == entity) {
			return true;
		}
		
		return false;
	}
	
	//returns the number of occupied cells (can be used to check if there is a draw)
	//keep count as an attribute which increases once a select() is run so the nested for loop is not needed (more efficient)

	public String toString() {
		String result = "";
		
		for(int row=0;row<grid.length;row++) {
			for(int collumn=0; collumn<grid.length;collumn++) {
				if(grid[row][collumn] == PLAYER) {
					result += "X";	
				}
				else if(grid[row][collumn] == OPPONENT) {
					result += "O";
				}
				else {
					result += "-";
				}
				result += "|";
			}
			result += "\n";
		}
		
		return result;
	}
}
