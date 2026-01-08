package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	private static Grid grid;
	private final static int GRIDSIZE = 3;
	private static boolean playerStatus = true;
	//public static RandomComputer O;
	public static Player P;
	public static Playable O;
	
	public static void start() {
		grid = new Grid(GRIDSIZE);//creates a 3x3 grid
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 player mode (1) or 2 player mode (2)");
		int mode = sc.nextInt();
		
		if (mode == 1) {
			P = new Player (grid, GRIDSIZE);
			O = new RandomComputer(grid, GRIDSIZE);//the player's most basic opposition
		}
		else if (mode == 2) {
			P = new Player (grid, GRIDSIZE);
			O = new Player2 (grid, GRIDSIZE);//the player's most basic opposition
		}

		//The game loop
		while(turn(P, O) == true) {
			turn(P, O);
		}
	}
	public static boolean turn(Playable P, Playable O) {
		
		try {
			//Switch between the player's and computer's turn
			if(playerStatus == true) {
				P.selectCell();
				playerStatus = false;
				}
			else {
				O.selectCell();
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
