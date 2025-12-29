package main;

import java.util.Random;

public class RandomComputer implements Computer {
	Grid grid;
	int gridSize;
	
	public RandomComputer(Grid grid, int gridSize) {
		this.grid = grid;
		this.gridSize = gridSize;
	}
	
	public void selectCell() {
		Random random = new Random();
		//CHANGE LATER TO SIZE
		int row = random.nextInt(gridSize) + 1;
		int collumn = random.nextInt(gridSize) + 1;
		
		System.out.println(row);
		System.out.println(collumn);
		
		grid.selectCell(row, collumn, grid.getOpponent());
	}
}
