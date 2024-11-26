package designPatternInterator;

public class NotificationCollection implements Collection{
	
	private static final int maxItems = 6;
	int numberOfItems = 0;
	Notification[] notificationList;
	
	public NotificationCollection() {
		this.notificationList = new Notification[maxItems];
	}
	
	public void addItem(String str) {
		Notification notification = new Notification(str);
		if (numberOfItems >= maxItems) {
			System.err.println("Notification collection is full!");
	} else {
		notificationList[numberOfItems] = notification;
		numberOfItems++;
	}
	
	public Iterator createIterator() {
		return new NotificationIterator(notificationList);
	}
	
}
