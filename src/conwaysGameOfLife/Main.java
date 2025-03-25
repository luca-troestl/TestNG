package conwaysGameOfLife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gittergröße (Breite Höhe): "); // User should define the size of the grid
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        boolean randomInit = true; // Random cells get selected to be alive, the rest is dead
        
        /**
         * Game of life starts and the grid gets printed onto the console
         */
        GameOfLife game = new GameOfLife(width, height, randomInit);
        
        /**
         * Infinite loop
         */
        while (true) {
            game.printGrid();
            game.nextGeneration();
            Thread.sleep(500);
        }
    }
}