package designPatternInterator;

public interface Collection {
	
	public Iterator createIterator();
	
	public void addItem(String str);
}
