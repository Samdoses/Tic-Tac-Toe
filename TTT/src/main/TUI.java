package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	
	public static void start(Grid grid, int GRIDSIZE, Player P, Playable O) {
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
		while(GameEngine.turn(P, O) == true) {
			GameEngine.turn(P, O);
		}
	}
}
