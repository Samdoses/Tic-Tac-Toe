package main;

import java.util.Random;

public class RandomComputer implements Computer {
	Grid grid;
	
	public RandomComputer(Grid grid) {
		this.grid = grid;
	}
	public void selectCell() {
		Random random = new Random();
		//CHANGE LATER TO SIZE
		int row = random.nextInt(3) + 1;
		int collumn = random.nextInt(3) + 1;
		
		System.out.println(row);
		System.out.println(collumn);
		
		grid.selectCell(row, collumn, grid.getOpponent());
	}
}
