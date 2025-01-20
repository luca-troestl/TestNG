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
		for(Shape shape : shapes) {
			shape.display();
		}
	}
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
}
