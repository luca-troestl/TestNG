package taskManagment;

public abstract class Task {

	String title;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void display();
	
	public void addTask(Task title) {
		
	}
	
}
