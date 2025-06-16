package taskManagement;

public class TaskManagementApp {

	public static void main(String[] args) {
		
		Task t = new SimpleTask();
		
		TaskList tl = new TaskList();
		tl.addTask(t);
		tl.display();
	}

}
