package designPatternInterator;

public class NotificationIterator implements Iterator{

	private Notification[] notificationList;
	private int pos;
	
	public NotificationIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
		this.pos = 0;
	}
	
	public Object next() {
		Notification notification = notificationList[pos];
		pos++;
		return notification;
	}
	
	public boolean hasNext() {
		if(pos < notificationList.length && notificationList[pos] != null) {
			return true;
		}
		return false;
	}
	
}
