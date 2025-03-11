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
	
	public void addNeighbour(Cell neighbour) {
		neighbours.add(neighbour);
	}
	
	public void NextState() {
        long livingNeighbours = neighbours.stream().filter(Cell::isAlive).count();
        if (isAlive) {
            willLive = (livingNeighbours == 2 || livingNeighbours == 3);
        } else {
            willLive = (livingNeighbours == 3);
        }
    }
	
	
	public void updateState() {
		isAlive = willLive;
	}
		

	static boolean isAlive() {
		return isAlive;
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	

}
