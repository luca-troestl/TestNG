package aufgabe1;

public class Main {

	public static void main(String[] args) {
		Anzeigeger�te observable = new Anzeigeger�te();
		Sensor observer = new Temperatursensor();
		
		observable.setTemperature(03);
		System.out.println(observable.getTemperature() + "�");
		
		Anzeigeger�teJava observableJava = new Anzeigeger�teJava();
		TemperatursensorJava observerJava = new TemperatursensorJava();
		observableJava.addObserver(observerJava);
		observableJava.setTemperature(13.3);
		
	}

}
