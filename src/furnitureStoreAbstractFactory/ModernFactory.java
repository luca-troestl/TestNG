package furnitureStoreAbstractFactory;

public class ModernFactory extends FurnitureFactory {

	@Override
	public Chairs createChair() {
		return new ModernChairs();
	}

	@Override
	public Table createTable() {
		return new ModernTable();
	}

}
