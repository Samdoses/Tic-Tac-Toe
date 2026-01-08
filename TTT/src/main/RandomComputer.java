package main;

import java.util.Random;

public class RandomComputer implements Playable {
	Grid grid;
	int gridSize;
	
	public RandomComputer(Grid grid, int gridSize) {
		this.grid = grid;
		this.gridSize = gridSize;
	}
	
	public void selectCell() {
		Random random = new Random();
		
		int row = random.nextInt(gridSize) + 1;
		int collumn = random.nextInt(gridSize) + 1;
		
		grid.selectCell(row, collumn, grid.getOpponent());
	}
}
