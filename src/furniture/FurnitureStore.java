package furniture;

public abstract class FurnitureStore {

	public static FurnitureStore getFactory(FactoryType type) {
		
		if(type == FactoryType.Modern) {
			return new ModernFactory();
		} else {
			return new AntiqueFactory();
		}
	}
	
	public abstract Chairs createChair();
	
	public abstract Tables createTable();
		
}
