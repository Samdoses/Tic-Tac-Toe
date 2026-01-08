package main;

import java.util.Scanner;

public class Player implements Playable {
	
	Grid grid;
	int gridSize;
	
	public Player(Grid grid, int gridSize) {
		this.grid = grid;
		this.gridSize = gridSize;
	}

	public void selectCell() {
		
		int row = 0;
		int collumn = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row");
		row = sc.nextInt();
		
		System.out.println("Enter collumn");
		collumn = sc.nextInt();
		
		grid.selectCell(row, collumn, grid.getPlayer());
		
	}

}
