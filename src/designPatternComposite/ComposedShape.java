package designPatternComposite;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
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
=======
public class ComposedShape extends Shape{

	private List<Shape> shapes;

	public ComposedShape() {
		this.shapes = new ArrayList<>();
	}
	
	@Override
	public void display() {
		for(Shape shape : shapes) {
			shape.display();
		}
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	}
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
}
