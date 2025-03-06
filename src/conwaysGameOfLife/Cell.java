package conwaysGameOfLife;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	
	private boolean isAlive;
	private boolean willLive;
	private List<Cell> neighbours;
	
	/*
	 * This Method creats a dead cell, it is not alive. Also it creates
	 * a new ArrayList for the upcoming cells
	 */
	public Cell() {
		this.isAlive = false;
		this.willLive = false;
		this.neighbours = new ArrayList<>();
	}
	
	

}
