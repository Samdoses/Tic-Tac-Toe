package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	private static Grid grid;
	private final static int GRIDSIZE = 3;
	private static boolean playerStatus = true;
	public static RandomComputer RC;
	
	public static void start() {
		grid = new Grid(GRIDSIZE);//creates a 3x3 grid
		RC = new RandomComputer(grid, GRIDSIZE);//the player's most basic opposition

		//The game loop
		while(true) {
			turn();
		}
	}
	public static void turn() {
		
		int row = 0;
		int collumn = 0;
		
		if(playerStatus == true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter row");
			row = sc.nextInt();
			
			System.out.println("Enter collumn");
			collumn = sc.nextInt();
		}
		

		try {
			//Switch between the player's and computer's turn
			if(playerStatus == true) {
				grid.selectCell(row, collumn, grid.getPlayer());
				playerStatus = false;
				}
			else {
				RC.selectCell();
				playerStatus = true;
			}
			System.out.println(grid);
		}
		catch(ArrayIndexOutOfBoundsException exception){
			//Index out of bounds check
			System.out.println("Selected cell out of bounds");
		}
		catch(OccupationException exception) {
			//Cell occupied check
			System.out.println("Selected cell already occupied");
		}
		
		
		//check if the player has won this term
		if (grid.win(grid.getPlayer())) {
			System.out.println("You are wiener");	
			return;
		}
		else if(grid.win(grid.getOpponent())) {
			System.out.println("Computer is wiener");	
			return;
		}
	}
}
