package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	private static Grid grid;
	private final static int GRIDSIZE = 3;
	
	public static void start() {
		grid = new Grid(GRIDSIZE);//creates a 3x3 grid

		//The game loop
		while(true) {
			turn();
		}
	}
	public static void turn() {
		
		int row = 0;
		int collumn = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row");
		row = sc.nextInt();
		
		System.out.println("Enter collumn");
		collumn = sc.nextInt();
		
		//index out of bounds check
		if(row > GRIDSIZE || row <= 0 || collumn > GRIDSIZE || collumn <= 0) {
			System.out.println("Out of bounds. Please try again");
		}
		else {
			grid.selectCell(row, collumn);
			System.out.println(grid);
		}
	}
}
