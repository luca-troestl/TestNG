package realStocks;

import java.util.ArrayList;
import java.util.List;

public abstract class Share {
	
	private double StockPrice;
	
	private List<Broker> brokers;
	
	public Share() {
		this.brokers = new ArrayList<Broker>();
	}
	
	public void register(Broker broker) {
		this.brokers.add(broker);
	}
	
	public void unregister(Broker broker) {
		this.brokers.remove(broker);
	}
	
	public void notify(double currentStockPrice) {
		for(Broker b : brokers) {
			b.update(currentStockPrice);
		}
	}
	
	public abstract double getCurrentStockPrice();
	public abstract void setCurrentStockPrice(double currentStockPrice);


	
}
