package aufgabe2Verbessert;

import java.util.List;
import java.util.ArrayList;

public abstract class Share {
	
	private List<Broker> brokers;
	
	public Share() {
		this.brokers = new ArrayList<Broker>();
	}
	
	public void register(Broker broker) {
		this.brokers.add(broker);
	}
	
	public void unregister (Broker broker) {
		this.brokers.remove(broker);
	}
	
	public void notify(double currentStockPrice) {
		for(Broker b : brokers) {
			b.update(currentStockPrice);
		}
	}
	
	public abstract double getCurrentStockPrice();
	public abstract void setcurrentStockPrice(double currentStockPrice);
	
}
