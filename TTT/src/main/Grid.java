package main;

public class Grid {
	Cell[] grid;
	
	public Grid(int size) {
		grid = new Cell[size];
		
		for(int i=0;i<9;i++) {
			Cell cell = new Cell(i);
			grid[i] = cell;
		}
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < grid.length; i++) {
			Cell cell = grid[i];
			result += cell.getID();
		}
		return result;
	}
}
