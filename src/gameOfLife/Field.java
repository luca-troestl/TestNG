package gameOfLife;

public class Field {

	private int length = 12;
	private int width = 100; 
	
	Cell [][] matrix = new Cell[length][width];
	
	
	/**
	 * The Method fills the MAtrix with new cells, which are randomly dead or alive
	 * It also puts a barrier of dead cells around the matrix
	 */
	public void fillMatrix() {
		for(int i=1;i<length-1;i++) {
			for(int j=1;j<width-1;j++) {
				matrix[i][j] = new Cell();
			}
		}
		for(int j=0;j<width;j++) {
			matrix[0][j] = new Cell();
			matrix[0][j].setAlive(false);
		}
		for(int i=0;i<length;i++) {
				matrix[i][0] = new Cell();
				matrix[i][0].setAlive(false);
				matrix[i][width-1] = new Cell();
				matrix[i][width-1].setAlive(false);
		}
			for(int j=0;j<width;j++) {
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
		 int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; //these matrixes help to address the neighbours
		 int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1}; 
		 for (int k = 0; k < 8; k++) {
	        int newX = posx + dx[k]; //created the variables newX and newY to check if the cell is in the matrix
	        int newY = posy + dy[k];
	        if (newX >= 0 && newX < this.length && newY >= 0 && newY < this.width) {
	        	if (matrix[newX][newY].isAlive()) {
	        		lebendeNachbarn++; //if the neighbour is alive lebendeNachbarn adds 1
		        }
		    }
		}
		return lebendeNachbarn;
	}
	
	/**
	 * The method goes over every cell in the matrix and checks if they are dead or alive next round
	 */
	public void nextRound() {
		
		for(int i=1;i<length-1;i++) {
			for(int j=1;j<width-1;j++) {
				int ln = anzahlLebendeNachbarn(i,j);
				if(matrix[i][j].isAlive()) {
					switch (ln) {
						
					case 0,1,4,5,6,7,8:
						matrix[i][j].setAlive(false);
						break;
					case 2,3:
						matrix[i][j].setAlive(true);
						break;
					}
				} else if(ln==3) {
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
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
}
