package exceptionsTesting;

public class StringProcessor {

	public String reverse(String input) throws NullPointerException{
		if(input==null) {
			throw new NullPointerException("Der Input-String darf nicht dem Wert null entsprechen");
		}
		String reversed = new StringBuilder(input).reverse().toString();
		return reversed;
	}
	
}
