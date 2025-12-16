package main;

import java.util.Scanner;

import java.util.Scanner;

public final class TUI {
	private static Grid grid;
	
	public static void start() {	
		grid = new Grid(3);//creates a 3x3 grid

		while(true) {
			turn();
		}
	}
	public static void turn() {
		System.out.println(grid);
		
		String row = "";
		String collumn = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row");
		row = sc.next();
		
		System.out.println("Enter collumn");
		collumn = sc.next();
		
		grid.selectCell(Integer.parseInt(row), Integer.parseInt(collumn));//parse to integer!!!
		
		System.out.println(grid);
	}
}
