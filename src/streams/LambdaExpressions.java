package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static void main(String[] args) {
		
	// Aufgabe 1 ---------------------------------------------------------------------------------------------------------------------
		
		List<String> names = Arrays.<String>asList("anna", "bernd", "clara");
		
		//Aufgabe 1 mit einer Methodenreferenz
		List<String> namesInUpperCase = names.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		
		//Aufgabe 1 mit Lambda
		List<String> namesInUpperCaseLambda = names.stream()
												.map(name -> name.toUpperCase())
												.collect(Collectors.toList());
		
		System.out.println(namesInUpperCase);
		System.out.println(namesInUpperCaseLambda);
		
		
	// --------------------------------------------------------------------------------------------------------------------------------
	//Aufgabe 2 -----------------------------------------------------------------------------------------------------------------------
		List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		List<Integer> zahlenDurchZwei = zahlen.stream()
										.filter(n -> n % 2 != 0)
										.collect(Collectors.toList());
		
		System.out.println(zahlenDurchZwei);
	//---------------------------------------------------------------------------------------------------------------------------------
	// Aufgabe 3 ----------------------------------------------------------------------------------------------------------------------
		List<Integer> zahlen1 = Arrays.asList(1, 2, 3, 4);
		
		int summe = zahlen1.stream()
					.reduce(0, Integer::sum);
		
		System.out.println(summe);
	//---------------------------------------------------------------------------------------------------------------------------------
	// Aufgabe 4 ----------------------------------------------------------------------------------------------------------------------
		
		class Product {
			String name;
		    double preis;

		    Product(String name, double preis) {
		        this.name = name;
		        this.preis = preis;
		    }

		    double getPreis() {
		        return this.preis;
		    }

		    @Override
		    public String toString() {
		        return name + ": " + preis + "�";
		    }
		    
		}
	
		        List<Product> produkte = Arrays.asList(
		            new Product("Laptop", 1200),
		            new Product("Tastatur", 45),
		            new Product("Monitor", 250),
		            new Product("Maus", 30),
		            new Product("Headset", 80)
		        );

		        List<Product> keine�berF�nfzig = produkte.stream()
		            .filter(i -> i.getPreis() > 50)
		            .collect(Collectors.toList());

		        	double nurPreis = keine�berF�nfzig.stream()
		            .mapToDouble(i -> i.getPreis())
		            .average()
		            .orElse(0);
		        	System.out.println(nurPreis);
		        
	}
}
	//---------------------------------------------------------------------------------------------------------------------------------

