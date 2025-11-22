package main;

public class Grid {
	Cell[][] grid;
	
	public Grid(int size) {
		grid = new Cell[size][size];
		
		for(int row=0;row<size;row++) {
			for(int collumn=0; collumn<size;collumn++) {
				Cell cell = new Cell(row, collumn);
				grid[row][collumn] = cell;	
			}
		}
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
