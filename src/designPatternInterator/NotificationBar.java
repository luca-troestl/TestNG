package designPatternInterator;

public class NotificationBar {
	
	private Collection notifications;

	public NotificationBar(Collection notifications) {
		this.notifications = notifications;
	}
	
	public void printNotifications() {
		Iterator iterator = notifications.createIterator();
		System.out.println("-----------NOTIFICATION BAR-----------");
		while(iterator.hasNext()) {
			Notification n = (Notification)iterator.next();
			System.out.println(n.getNotification());
		}
	}
	
	public void addItem(String str) {
		notifications.addItem(str);
	}
	
}
