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
	
	//in the future another parameter is needed to understand if it is for player or computer
	public void selectCell(int row, int collumn){
		Cell cell = grid[row][collumn];
		cell.setOwner(2);//later this can be enum or that variable which does not change. (2 is easily forgotten)
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
