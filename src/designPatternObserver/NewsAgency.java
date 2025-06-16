package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
	
	private String news;
	private List <Channel> channels;
	public NewsAgency() {
		this.channels = new ArrayList <Channel>();
	}
	
	
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	public String getNews() {
		return news;
	}
	public void addObserver (Channel channel) {
		this.channels.add(channel);
	}
	
	public void removeObserver (Channel channel) {
		this.channels.remove(channel);
	}
	public void setNews(String news) {
		this.news=news;
		for(Channel c: channels) {
			c.update(news);
		}
	}
}
