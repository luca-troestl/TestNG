package taskManagment;

import java.util.ArrayList;
import java.util.List;

public class TaskList extends Task {
	
	private List<Task> task;
	
	public TaskList() {
		this.task = new ArrayList<>();
	}

	@Override
	public void display() {
		for(Task t : task) {
			t.display();
		}
	}

	@Override
	public void addTask(Task title) {
		task.add(title);
	}

}
