package aufgabe1;

public class Main {

	public static void main(String[] args) {
		Anzeigegeräte observable = new Anzeigegeräte();
		Sensor observer = new Temperatursensor();
		
		observable.setTemperature(03);
		System.out.println(observable.getTemperature() + "°");
		
		AnzeigegeräteJava observableJava = new AnzeigegeräteJava();
		TemperatursensorJava observerJava = new TemperatursensorJava();
		observableJava.addObserver(observerJava);
		observableJava.setTemperature(13.3);
		
	}

}
