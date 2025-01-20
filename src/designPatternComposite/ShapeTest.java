package designPatternComposite;

public class ShapeTest {

	public static void main(String[] args) {

		Shape c = new Circle();
		Shape r = new Rectangle();
		Shape t = new Triangle();
		
		Shape cs1 = new ComposedShape();
		cs1.add(c);
		cs1.add(r);
		
		Shape cs2 = new ComposedShape();
		cs2.add(cs1);
		cs2.add(t);
		
		Screen screen1 = new Screen(cs1);
		screen1.display();
		System.out.println("");
		Screen screen2 = new Screen(cs2);
		screen2.display();
		

	}

}
