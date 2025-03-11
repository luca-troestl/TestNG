package gameOfLife;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Field f = new Field();
		f.fillMatrix();
		while(1>0) {
				f.printMatrix();
				f.nextRound();
				Thread.sleep(500);
		}
		
	}

}
