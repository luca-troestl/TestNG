package conwaysGameOfLife;

import java.util.Random;
import java.util.Scanner;

class GameOfLife {
    private final int width;
    private final int height;
    private Cell[][] grid;
    private Cell[][] nextGrid;
    
    /**
     * Constructor for the game of life and death
     * @param width ... width of the grid the cells live in
     * @param height ... height of the grid the cells live in
     * @param randomInit ... a randome chance that decides at the start if a cell lives or is dead
     */
    public GameOfLife(int width, int height, boolean randomInit) {
        this.width = width;
        this.height = height;
        this.grid = new Cell[width][height];
        this.nextGrid = new Cell[width][height];
        
        initializeGrid();
        if (randomInit) {
            initializeRandom();
        } 
    }
    
    /**
     * Creating the grid
     */
    private void initializeGrid() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y] = new Cell();
                nextGrid[x][y] = new Cell();
            }
        }
    }
    
    /**
     * Initialize the random cells
     */
    private void initializeRandom() {
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y].setAlive(random.nextBoolean());
            }
        }
    }
    
    /**
     * Method for the generation of the Next creation of the grid
     */
    public void nextGeneration() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int neighbors = countLivingNeighbors(x, y);
                if (grid[x][y].isAlive()) {
                    nextGrid[x][y].setAlive(neighbors == 2 || neighbors == 3);
                } else {
                    nextGrid[x][y].setAlive(neighbors == 3);
                }
            }
        }
        Cell[][] temp = grid;
        grid = nextGrid;
        nextGrid = temp;
    }
    
    /**
     * Method that helps the cells count theyre neighbours
     * @param x 
     * @param y
     * @return
     */
    private int countLivingNeighbors(int x, int y) {
        int count = 0;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;
                int nx = x + dx;
                int ny = y + dy;
                if (nx >= 0 && nx < width && ny >= 0 && ny < height && grid[nx][ny].isAlive()) {
                    count++;
                }
            }
        }
        return count;
    }
    
    
   /**
    * Method to print the grid onto the console
    */ 
    public void printGrid() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(grid[x][y].isAlive() ? "■" : " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}