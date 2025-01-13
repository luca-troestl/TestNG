package designPatternObserver;

public interface Channel {
	
	public void update(String news);
	//Methode, um den Zustand eines Observers anzupassen
	public String getNews();
	public void setNews(String news);
	
	
}
