package realStocks;

public class SharePrice extends Share {

	private double currentStockPrice;

	@Override
	public double getCurrentStockPrice() {
		return this.currentStockPrice;
	}

	@Override
	public void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
		notify(currentStockPrice);
	}


	
	
}
