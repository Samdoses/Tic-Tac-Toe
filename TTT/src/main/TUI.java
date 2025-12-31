package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	private static Grid grid;
	private final static int GRIDSIZE = 3;
	private static boolean playerStatus = true;
	public static RandomComputer RC;
	public static Player P;
	
	public static void start() {
		grid = new Grid(GRIDSIZE);//creates a 3x3 grid
		P = new Player (grid, GRIDSIZE);
		RC = new RandomComputer(grid, GRIDSIZE);//the player's most basic opposition

		//The game loop
		while(turn() == true) {
			turn();
		}
	}
	public static boolean turn() {
		
		try {
			//Switch between the player's and computer's turn
			if(playerStatus == true) {
				P.selectCell();
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
			System.out.println("You are wiener!");	
			return false;
		}
		else if(grid.win(grid.getOpponent())) {
			System.out.println("Computer is wiener!");	
			return false;
		}
		else if(grid.getCount() == (GRIDSIZE * GRIDSIZE)) {
			System.out.println("Draw!");	
			return false;
		}
		
		return true;
	}
}
