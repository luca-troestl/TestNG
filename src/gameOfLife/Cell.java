package gameOfLife;

public class Cell {
	
	private boolean isAlive;

	
	/**
	 * The Method decides randomly if the Cell is dead or alive
	 * @return true (40%) or falls (60%)
	 */
	private boolean setCellCondition() {
		double d = Math.random(); 
		if(d>=0.6) { // 40% chance that the cell is alive
			return true;
		} else {
			return false;
		}
	}
	
	public Cell() {
		this.isAlive = setCellCondition();
	}

	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	/**
	 * If the cell is alive there will be a 'X' printed out, if it's dead there will be '.'
	 */
	public String toString() {
		if(isAlive==true) {
			return "X"; // If the cell is alive 'X' will be printed out
		} else {
			return "."; // If it's dead than '.' will be printed out
		}
	}
	
	
}
