package aufgabe2Verbessert;

public class BrokerClient implements Broker{
	
	private double currentStockPrice;

	public double getCurrentStockPrice() {
		return currentStockPrice;
	}
	private void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}

	@Override
	public void update(double currentStockPrice) {
		this.setCurrentStockPrice(currentStockPrice);
	}
	
}
