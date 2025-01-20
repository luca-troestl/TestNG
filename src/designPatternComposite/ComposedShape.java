package designPatternComposite;

import java.util.ArrayList;
import java.util.List;

public class ComposedShape extends Shape {

	private List<Shape> shapes;
	
	public ComposedShape() {
		this.shapes = new ArrayList<>();
	}

	@Override
	public void display() {
		System.out.print("[");
		for(Shape shape : shapes) {
			shape.display();
		}
		System.out.print("]");
	}
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
}
