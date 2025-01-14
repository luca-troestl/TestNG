package realStocks;

public class BrokerObserverTest {

	public static void main(String[] args) {
		
		Share share = new SharePrice();
		
		Broker broker1 = new BrokerClient();
		Broker broker2 = new BrokerClient();
		Broker broker3 = new BrokerClient();
		
		share.register(broker1);
		share.register(broker2);
		share.register(broker3);
		
		share.setCurrentStockPrice(128.87);
		
		System.out.println("StockPrice: " + share.getCurrentStockPrice());
		System.out.println("Broker1: " + broker1.getCurrentStockPrice());
		System.out.println("Broker2: " + broker2.getCurrentStockPrice());
		System.out.println("Broker3: " + broker3.getCurrentStockPrice());
	}

}
