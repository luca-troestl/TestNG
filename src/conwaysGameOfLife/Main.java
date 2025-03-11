package conwaysGameOfLife;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		 int width = 20;
	        int height = 20;
	        GameOfLife game = new GameOfLife(width, height);

	        // Beispiel: Initialisierung des Spielfelds mit lebenden Zellen
	        game.getCell(1, 1).setAlive(true);
	        game.getCell(1, 2).setAlive(true);
	        game.getCell(1, 3).setAlive(true);

	        while (true) {
	            game.printGrid();
	            game.nextGeneration();
	            Thread.sleep(500);
	        }
	 	}
	}
