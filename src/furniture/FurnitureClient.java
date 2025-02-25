package furniture;

public class FurnitureClient {

	public static void main(final String[] args) {
		
		final FurnitureStore mFactory = ModernFactory.getFactory(FactoryType.Modern);
		final FurnitureStore aFactory = AntiqueFactory.getFactory(FactoryType.Antique);
		
		mFactory.createChair().orderFurniture();
		aFactory.createTable().orderFurniture();
		
	}
	
}
