package furnitureStoreAbstractFactory;

public class AntiqueFactory extends FurnitureFactory {

	@Override
	public Chairs createChair() {
		return new AntiqueChair();
	}

	@Override
	public Table createTable() {
		return new AntiqueTable();
	}

}
