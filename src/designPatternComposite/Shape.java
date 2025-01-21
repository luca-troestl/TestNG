package designPatternComposite;

public abstract class Shape {
	
	public abstract void display();
	
	public void add(Shape shape) {
		// Leermethode für die Leaf-Nodes
		// Methode muss in ComposedShape überschrieben werden
	}
	
}
