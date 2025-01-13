package designPatternObserver;

public class Main {

	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		Channel observer = new NewsChannel();
		
		observable.addObserver(observer);
		observable.setNews("test");
		System.out.println(observable.getNews() + " = " + observer.getNews());
		
		NewsAgencyJava observableJava = new NewsAgencyJava();
		NewsChannelJava observerJava = new NewsChannelJava();
		observableJava.addObserver(observerJava);
		observableJava.setNews("Test");
	}

}
