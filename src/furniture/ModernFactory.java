package furniture;

public class ModernFactory extends FurnitureStore{
	
	@Override
	public Chairs createChair() {
		return new ModernChairs();
	}

	@Override
	public furniture.Tables createTable() {
		return new ModernTables();
	}

	
	
}
