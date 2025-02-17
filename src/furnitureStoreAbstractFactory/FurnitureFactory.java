package furnitureStoreAbstractFactory;

public abstract class FurnitureFactory {
	
	public static FurnitureFactory getFactory(FurnitureType type) {
		if(type == FurnitureType.MODERN) {
			return new ModernFactory();
		} else {
			return new AntiqueFactory();
		}
	}
	
	public abstract Chairs createChair();
	public abstract Table createTable();

}
