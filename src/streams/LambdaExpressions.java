package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("anna", "bernd", "clara");
		
		List<String> namesInUpperCase = names.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		
		// Aufgabe 1 (mit Lambda)
		List<String> namesInUpperCaseLambda = names.stream()
												.map(name -> name.toUpperCase())
												.collect(Collectors.toList());
		System.out.println(namesInUpperCase);
		System.out.println(namesInUpperCaseLambda);
		
		//Aufgabe 2
		List<Integer> zahlen = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> ungeradeZahlen = zahlen.stream()
										.filter(n -> n % 2 != 0)
										.collect(Collectors.toList());
		System.out.println(ungeradeZahlen);
		//Aufgabe 3
		List<Integer> zahlen2 = Arrays.asList(1,2,3,4);
		Optional<Integer> zahlenMultipliziert = zahlen2.stream()
									.reduce((a,b) -> a*b);
		System.out.println(zahlenMultipliziert);
		//Aufgabe 4
		
		class Product {
			private String name = null;
			private double preis = 0;
			public Product(String name, double preis) {
				this.name = name;
				this.preis=preis;
			}
			double getPreis() {
				return this.preis;
			}
		}
		
		List<Product> produkte = Arrays.asList(
				new Product("Laptop",1200),
				new Product("Tastatur",45),
				new Product("Monitor",250),
				new Product("Maus",30),
				new Product("Headset",80)
				);
		List<Product> teureProdukte = produkte.stream()
										.filter(i -> i.getPreis() > 50)
										.collect(Collectors.toList());
		double durchschnittsPreis = teureProdukte.stream()
									.mapToDouble(Product::getPreis)
									.average()
									.orElse(0);
		System.out.println(durchschnittsPreis);
	}

}
