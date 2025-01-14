package aufgabe2Verbessert;

public class StockPrice extends Share{

	private double currentStockPrice;
	
	@Override
	public double getCurrentStockPrice() {
		return this.currentStockPrice;
	}

	@Override
	public void setcurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
		notify(currentStockPrice);
	}
	
	
	
}
