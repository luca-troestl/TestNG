package designPatternComposite;

public class Screen {

	
	private Shape composedShape;
	
	public Screen(Shape composedShape) {
		this.composedShape = composedShape;
	}
	
	public void display() {
		this.composedShape.display();
	}
}
