package designPatternInterator;
 
public class NotificationCollection {
 
	private static final int maxItems = 6;
	int numberOfItems = 0;
	Notification[] notificationList;
	
	public NotificationCollection() {
		this.notificationList = new Notification[maxItems];
	}
	/**
	 * The Method adds an Item to the Notification List
	 * @param str
	 */
	public void addItem(String str) {
		Notification notification = new Notification(str);
		if(numberOfItems >= maxItems) {
			System.err.println("Notification collection is full!");
		} else {
			notificationList[numberOfItems] = notification;
			numberOfItems++;
		}
	}
	/**
	 * The Methods creates a new Iterator
	 * @return
	 */
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
	
}
 
 