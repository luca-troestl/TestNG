package designPatternSingleton;

public class Datenbankverbindung {
	
	private Datenbankverbindung() {}
	
	private static class DatenbankverbindungHolder{
		private final static Datenbankverbindung INSTANCE = new Datenbankverbindung();
	}
	
	public static Datenbankverbindung getInstance() {
		return DatenbankverbindungHolder.INSTANCE;
	}
	
	public void verbindungsMessage(String daten) {
		System.out.println("zu uebertragende Daten: " + daten);
	}
	
}
