package conwaysGameOfLife;

public class GameOfLife {
	
	private int height;
	private int width;
	private Cell[][] grid;
	
	public GameOfLife(int width, int height) {
		this.width = width;
		this.height = height;
		this.grid = new Cell[width][height];
		initializeGrid();
		setNeighbours();
	}
	
	private void initializeGrid() {
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				grid[x][y] = new Cell();
			}
		}
	}
	
	private void setNeighbours() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Cell cell = grid[x][y];
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        if (dx != 0 || dy != 0) {
                            int nx = (x + dx + width) % width;
                            int ny = (y + dy + height) % height;
                            cell.addNeighbour(grid[nx][ny]);
                        }
                    }
                }
            }
        }
    }
	
	public void nextGeneration() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y].nextState();
            }
        }
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y].updateState();
            }
        }
    }

    public void printGrid() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(grid[x][y].isAlive() ? "*" : ".");
            }
            System.out.println();
        }
    }
    
    public Cell getCell(int x, int y) {
        return grid[x][y];
    }
	
	

}
