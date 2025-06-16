package designPatternSingleton;

public class Logger {
	
	private Logger() {}
	
<<<<<<< HEAD
	private static class LoggerHolder {
		private final static Logger INSTANCE = new Logger();
	}

=======
	private static class LoggerHolder{
		private final static Logger INSTANCE = new Logger();
	}
	
>>>>>>> branch 'master' of https://github.com/StringManu/4haSWP.git
	public static Logger getInstance() {
		return LoggerHolder.INSTANCE;
	}
	
	public void logMessage(String message) {
		System.out.println("[LOG:] " + message);
	}
	
}
