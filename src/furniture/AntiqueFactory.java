package furniture;

public class AntiqueFactory extends FurnitureStore{

	@Override
	public Chairs createChair() {
		return new AntiqueChairs();
	}

	@Override
	public furniture.Tables createTable() {
		return new AntiqueTables();
	}
	
	
}
