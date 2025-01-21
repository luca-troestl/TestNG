package taskManagment;

public class TestTaskManagment {

	public static void main(String[] args) {
		
		Task main = new SimpleTask();
		
		Task beta = new SimpleTask();
		
		main.addTask(beta);
		main.display();
		
	}

}
