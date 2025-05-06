package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams_Aufgaben_HART {
	
	public static void main(String[] args) {

		//Aufgabe 1 sehr schwierig!!
		
		System.out.println("----------------------------------Aufgabe 1--------------------------------------");
		
		List<String> names = Arrays.asList("Manu", "Haid", "Troetle", "Barbie");
		List<String> nameInCapitalLetter = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Neue Namensliste die in Großbuchstaben geschrieben ist... \n" + nameInCapitalLetter);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<Double> prices = Arrays.asList(200.21, 400.99, 500.34);
		List<Double> tenPercentHigher = prices.stream()
				.map(p -> p * 1.1)
				.collect(Collectors.toList());
		System.out.println("Neue Preisliste die 10% höher ist... \n" + tenPercentHigher);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<String> words = Arrays.asList("Manu", "Steuerhinterziehungsverfahren", "Hausfriedensbruch");
		List<Integer> wordsLength = words.stream()
				.map(wl -> wl.length())
				.collect(Collectors.toList());
		System.out.println("Neue Liste für die Anzahl der Wörter... \n" + wordsLength);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------Aufgabe 2---------------------------------");
		
		List<Integer> numbers = Arrays.asList(12, 14, 20, 69);
		List<Integer> oddNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(oddNumbers);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<String> words1 = Arrays.asList("Manu", "Brabista", "Mecklenburgvorpommern");
		List<String> wordsLongerThan5 = words1.stream()
				.filter(w -> w.length() >= 5)
				.collect(Collectors.toList());
		System.out.println(wordsLongerThan5);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<Double> temperatures = Arrays.asList(18.38, 31.9, 45.89);
		List<Double> highTemperatures = temperatures.stream()
				.filter(t -> t >= 30)
				.collect(Collectors.toList());
		System.out.println(highTemperatures);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------Aufgabe 3----------------------------------");
		
		List<Integer> numbers1 = Arrays.asList(10, 50, 100);
		Optional<Integer> sumOfNumbers = numbers1.stream()
				.reduce((a,b) -> a+b);
		System.out.println(sumOfNumbers);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<String> words2 = Arrays.asList("Manu", "ist", "fett");
		Optional<String> chainedString = words2.stream()
				.reduce((a,b) -> a + " " + b);
		System.out.println(chainedString);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<Double> prices1 = Arrays.asList(13.99, 49.99, 50.34);
		Optional<Double> productPrice = prices1.stream()
				.reduce((a,b) -> a+b);
		System.out.println(productPrice);
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------Aufgabe 4----------------------------------");
		
		List<Integer> numbers2 = Arrays.asList(1, 20, 45);
		Optional<Integer> ultraSum = Optional.ofNullable(numbers2.stream()
				.map(n -> n+5)
				.filter(n -> n%2 == 0)
				.reduce((a,b) -> a+b)
				.orElse(null));
		System.out.println(ultraSum);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		List<String> names2 = Arrays.asList("Manu", "Haid", "Barbie", "Asyncronmotor");
		int ultraName = (int) names2.stream()
				.filter(name -> name.startsWith("A"))
				.map(String::toUpperCase)
				.count();
		System.out.println(ultraName);
				
	}
}
