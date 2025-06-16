package gameOfLife;

public class Field {

	private int length;
	private int width; 
	Cell [][] matrix;

	public Field(int l, int w) {
		this.length = l;
		this.width = w;
		this.matrix = new Cell[this.length][this.width];
	}
	
	
	/**
	 * The Method fills the MAtrix with new cells, which are randomly dead or alive
	 * It also puts a barrier of dead cells around the matrix
	 */
	public void fillMatrix() {
		for(int i=1;i<length-1;i++) { //goes over every row
			for(int j=1;j<width-1;j++) { //goes over every column
				matrix[i][j] = new Cell(); // puts a cell in every place in the matrix
			}
		}
		for(int j=0;j<width;j++) { // puts a dead edge around the matrix
			matrix[0][j] = new Cell();
			matrix[0][j].setAlive(false);
		}
		for(int i=0;i<length;i++) { // puts a dead edge around the matrix
				matrix[i][0] = new Cell();
				matrix[i][0].setAlive(false);
				matrix[i][width-1] = new Cell();
				matrix[i][width-1].setAlive(false);
		}
			for(int j=0;j<width;j++) { // puts a dead edge around the matrix
				matrix[length-1][j] = new Cell();
				matrix[length-1][j].setAlive(false);
			}
	}

	
	/**
	 * The Method counts the neighbours which are alive 
	 * @param posx The xCoordinate of the cell in the matrix
	 * @param posy The yCoordinate of the cell in the matrix
	 * @return how many neighbours of the cell are alive
	 */
	private int anzahlLebendeNachbarn(int posx, int posy) {
		 int lebendeNachbarn = 0; 
		 int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; //these one-dimensional matrixes help to address the neighbours
		 int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1}; // of the current Cell
		 for (int k = 0; k < 8; k++) {
	        int newX = posx + dx[k]; //created the variables newX and newY to check if the cell is in the matrix
	        int newY = posy + dy[k];
	        if (newX > 0 && newX < this.length && newY > 0 && newY < this.width) {
	        	if (matrix[newX][newY].isAlive()) {
	        		lebendeNachbarn++; //if the neighbour is alive 'lebendeNachbarn' adds 1 to the current count
		        }
		    }
		}
		return lebendeNachbarn;
	}
	
	/**
	 * The method goes over every cell in the matrix and determines if they are dead or alive in the next round
	 */
	public void nextRound() {
		for(int i=1;i<length-1;i++) {
			for(int j=1;j<width-1;j++) {
				int ln = anzahlLebendeNachbarn(i,j); // the count of the alive neighbours is determined with the method above
				if(matrix[i][j].isAlive()) {
					switch (ln) {
						
					case 0,1,4,5,6,7,8: // if the cell is alive and doesn't have 2 or 3 neighbours than it dies
						matrix[i][j].setAlive(false);
						break;
					case 2,3: // if the cell is alive and has 2 or 3 neighbours than it stays alive
						matrix[i][j].setAlive(true);
						break;
					}
				} else if(ln==3) { // if the cell is dead and has 3 neighbours than it will be reborn
					matrix[i][j].setAlive(true);
				}
			}
		}
	}
	
	/**
	 * The Method prints out the matrix
	 */
	public void printMatrix() { 
		for(int i=0;i<length;i++) {
			for(int j=0;j<width;j++) {
				System.out.print(matrix[i][j]); // prints out every Cell in the matrix
			}
			System.out.println(); // With this it will move to another line each row
		}
		System.out.println(); // two lines after each round
		System.out.println(); 
	}
	
}
