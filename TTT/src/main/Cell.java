package main;

public class Cell {
	private int row;
	private int collumn;
	private int owner = 0;//if the cell is unowned, or owned by player/computer
	
	public Cell(int row, int collumn) {
		this.row = row;
		this.collumn = collumn;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCollumn() {
		return collumn;
	}
	
	private void setOwner() {
		this.owner = owner;
	}
	
	public int getOwner(){
		return owner;
	};
}
