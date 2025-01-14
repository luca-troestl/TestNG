package realStocks;

public class BrokerClient implements Broker{
	
	private double currentStockPrice;

	
	public void update(double currentStockPrice) {
		this.setCurrentStockPrice(currentStockPrice);
	}

	public double getCurrentStockPrice() {
		return currentStockPrice;
	}

	private void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}
	
	

}
