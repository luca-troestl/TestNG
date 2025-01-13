package designPatternIterator;
 
public class NotificationBar {
	
	private Collection notifications;
 
	public NotificationBar(Collection notifications) {
		this.notifications = notifications;
	}
	
	/**
	 * Method to print Notifications
	 */
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		System.out.println("-----------NOTIFICATION BAR-----------");
		while(iterator.hasNext()) {
			Notification n = (Notification)iterator.next();
			System.out.println(n.getNotification());
		}
	}
	
	/**
	 * Method to add smth to an item
	 * @param str
	 */
	public void addItem(String str) {
		notifications.addItem(str);
	}
	
}
 