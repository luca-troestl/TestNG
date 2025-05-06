package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import streams.Heroes.Hero;
import streams.Heroes.Hero.Sex;

public class LambdaHeroes {

	public static void main(String[] args) {
		
		List<Hero> heroes = Heroes.ALL; // speichert alle Helden in einer Liste
										// import aus eigener Klasse
		
		// Aufgabe T1
		Consumer<Hero> csvPrinter = hero -> System.out.printf("%s,%s,%s%n", hero.name(), hero.sex(), hero.yearFirstAppearance());
		heroes.stream()
			.forEach(csvPrinter);
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		// Aufgabe T2
		Predicate<Hero> isAppearanceAfter1900 = hero -> hero.yearFirstAppearance() >= 1900;
		System.out.println("Sind alle Helden innerhalb der Liste nach 1900 veroeffentlicht worden? " + heroes.stream().allMatch(isAppearanceAfter1900));
		
		// Aufgabe T3
		Predicate<Hero> isOneGirl = hero -> hero.sex() == Sex.FEMALE;
		System.out.println("Gibt es innerhalb der Liste eine Heldin? " + heroes.stream().anyMatch(isOneGirl));
			
		Predicate<Hero> isAppearanceAfter1950 = hero -> hero.yearFirstAppearance() >= 1950;
		System.out.println("Gibt es einen Helden der nach 1950 veroeffentlicht wurde? " + heroes.stream().anyMatch(isAppearanceAfter1950));
		
		

	}

}
