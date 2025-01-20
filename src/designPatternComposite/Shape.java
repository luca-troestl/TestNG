package designPatternComposite;

public abstract class Shape {

	public abstract void display();
	
	public void add(Shape shape) {
		//Leermethode f�r die Leaf-Nodes
		//Methode muss in ComposedShape �berschrieben werden
	}
	
}
