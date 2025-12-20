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
		try {
			grid.selectCell(row, collumn);
			System.out.println(grid);
		}
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Selected cell out of bounds");
		}
		catch(OccupationException exception) {
			System.out.println("Selected cell already occupied");
		}
		
		
		//check if the player has won this term
		if (grid.win()) {
			System.out.println("You are wiener");	
		}
	}
}
