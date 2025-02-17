package furnitureStoreAbstractFactory;


public class FurnitureClient {

private FurnitureFactory factory;
	
	public FurnitureClient(FurnitureFactory factory) {
		this.factory = factory;
	}
	
	public FurnitureClient(FurnitureType type) {
		this.factory = FurnitureFactory.getFactory(type);
	}
	
	public void orderFurniture() {
		Chairs chair = factory.createChair();
		Table table = factory.createTable();
		chair.orderItem();
		table.orderItem();
	}
	
	public FurnitureFactory getFactory() {
		return factory;
	}

	public void setFactory(FurnitureFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		FurnitureClient modernFactory = new FurnitureClient(FurnitureType.MODERN);
		modernFactory.orderFurniture();
		
		FurnitureFactory factory = FurnitureFactory.getFactory(FurnitureType.ANTIQUE);
		Chairs chair = factory.createChair();
		chair.orderItem();
		
	}

}
