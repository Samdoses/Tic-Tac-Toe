package main;

public class Grid {
	int[][] grid;
	//make size a 
	
	public Grid(int size) {
		grid = new int[size][size];
		
		for(int row=0;row<size;row++) {
			for(int collumn=0; collumn<size;collumn++) {
				grid[row][collumn] = 0;	
			}
		}
	}
	
	//in the future another parameter is needed to understand if it is for player or computer
	public void selectCell(int row, int collumn){
		
		if(grid[row-1][collumn-1] != 0) {
			throw new OccupationException ();
		}
		else {
			grid[row-1][collumn-1] = 1;//later this can be enum or that variable which does not change. (2 is easily forgotten)
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
