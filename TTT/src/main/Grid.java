package main;

public class Grid {
	Cell[][] grid;
	//make size a 
	
	public Grid(int size) {
		grid = new Cell[size][size];
		
		for(int row=0;row<size;row++) {
			for(int collumn=0; collumn<size;collumn++) {
				Cell cell = new Cell(row, collumn);
				grid[row][collumn] = cell;	
			}
		}
	}
	
	//in the future another parameter is needed to understand if it is for player or computer
	public void selectCell(int row, int collumn){
		Cell cell = grid[row-1][collumn-1];
		if(cell.getOwner() != 0) {
			throw new OccupationException ();
		}
		else {
			cell.setOwner(1);//later this can be enum or that variable which does not change. (2 is easily forgotten)
		}
	}
	
	//checks if the player has won
	public boolean win() {
		
		int count=0;
		
		for(int row=0;row<grid.length;row++) {
			for(int collumn=0; collumn<grid.length;collumn++) {
				Cell cell = grid[row][collumn];
				if(cell.getOwner() == 1) {
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
				Cell cell = grid[row][collumn];
				result += cell.getOwner();	
			}
			result += "\n";
		}
		
		return result;
	}
}
