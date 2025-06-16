package zaubererUndKrieger;

public abstract class Warrior {

	private String name;

	public Warrior(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "\n Klasse: Krieger \n" + "Spiel-Typ: " ;
	}
	
}
