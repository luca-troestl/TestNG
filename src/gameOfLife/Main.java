package gameOfLife;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte laenge eingeben");
		int length = sc.nextInt();
		System.out.println("Bitte breite eingeben");
		int width = sc.nextInt();
		sc.close();
		
		Field f = new Field(length,width);
		f.fillMatrix();
		while(1>0) {
				f.printMatrix();
				f.nextRound();
				Thread.sleep(500);
		}
		
	}

}
