package taskManagement;

import java.util.ArrayList;
import java.util.List;

public class TaskList extends Task{

	private List<Task> tasks;

	public TaskList() {
		this.tasks = new ArrayList<>();
	}

	@Override
	public void display() {
		for(Task t : tasks) {
			t.display();
		}
	}

	@Override
	public void addTask(Task t) {
		tasks.add(t);
	}
	
}
