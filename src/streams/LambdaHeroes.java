package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator;

import streams.Heroes.Hero;
import streams.Heroes.Universe;
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
		Predicate<Hero> isAppearanceAfter1950 = hero -> hero.yearFirstAppearance() >= 1950;
		System.out.println("Gibt es eine weibliche Helding, die nach 1950 veroeffentlicht wurde? " + heroes.stream().anyMatch(isOneGirl.and(isAppearanceAfter1950)));

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T4

		Comparator<Hero> firstAppearingHero = Comparator.comparingInt(h -> h.yearFirstAppearance());
		System.out.println("Der erste Held, der in der Liste vorkommt ist: " + heroes.stream().min(firstAppearingHero));


		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T5
		// Meine Lösung:
		Comparator<Hero> closestTo1960 = Comparator.comparingInt(h -> Math.abs(h.yearFirstAppearance() - 1960));
		System.out.println("Der Held, der am naechsten am Jahr 1960 liegt ist: " + heroes.stream().min(closestTo1960));
		// Lösung meines Professors:
		System.out.println(heroes.stream().reduce((hero1, hero2) -> {
			final int YEAR = 1960; // unveränderbare Konstante
			int diff1 = Math.abs(hero1.yearFirstAppearance() - YEAR);
			int diff2 = Math.abs(hero2.yearFirstAppearance() - YEAR);
			return diff1 < diff2 ? hero1 : hero2; // return the hero closest to 1960
		}));

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T6 

		StringBuilder years = new StringBuilder();
		heroes.stream()
			.map(hero -> hero.yearFirstAppearance())
			.forEach(year -> years.append(year).append(","));
		System.out.println(years.toString());

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T7 
		
		Map<Sex, List<Hero>> groupedBySex = heroes.stream()
			.collect(Collectors.groupingBy(Hero::sex));

		groupedBySex.forEach((sex, heroList) -> {
			System.out.printf("Geschlecht: %s, Anzahl der Helden: %d%n", sex, heroList.size());
		});

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T8 

		Map<Boolean, List<Hero>> partitionedByYear = heroes.stream()
			.collect(Collectors.partitioningBy(hero -> hero.yearFirstAppearance() < 1970));
		partitionedByYear.forEach((isBefore1970, heroList) -> {
			System.out.printf("Vor 1970: %s, Anzahl der Helden: %d%n", isBefore1970, heroList.size());
		});

		System.out.println("------------------------------------------------------------------------------------------------------");


// Teststoff: Di, 20.5
// Kapitel "Streams" => Kompletts Kapitel 14... mit allen Übungen usw.
// - File Klasse
// - Serialisierung
// - Stream-API (.stream())
// - Consumer, Predicate, Comparator


// Intermidiäre (nicht terminale) Operationen:

System.out.println("Intermediäre Operationen: ------------------------------------------------------------------------------------------------------");

        // Aufgabe T1

		long femaleHeroesCount = heroes.stream()
			.filter(hero -> hero.sex() == Sex.FEMALE)
			.count();

		System.out.println("Anzahl der weiblichen Helden: " + femaleHeroesCount);

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T2

		List<String> heroNamesSortedByAppearance = heroes.stream()
			.sorted(Comparator.comparingInt(Hero::yearFirstAppearance))
			.map(Hero::name)
			.collect(Collectors.toList());

		System.out.println("Namen der Helden, sortiert nach Erscheinungsjahr: " + heroNamesSortedByAppearance);

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T3

		// a) 
		String femaleHeroNames = heroes.stream()
			.filter(hero -> hero.sex() == Sex.FEMALE)
			.map(Hero::name)
			.collect(Collectors.joining(", "));
			
			System.out.println("Namen der weiblichen Helden: " + femaleHeroNames);
	

		// b) 
		List<String> anonymousHeroes = heroes.stream()
			.map(hero -> hero.name().replaceAll("\\(.*?\\)", "").trim())
			.collect(Collectors.toList());

			System.out.println("Namen der Helden ohne Alias: " + anonymousHeroes);
			
		// c) 

		List<Integer> yearsHerosHaveAppeared = heroes.stream()
			.map(Hero::yearFirstAppearance)
			.distinct()
			.collect(Collectors.toList());

		System.out.println("Jahre, in denen Helden erschienen sind: " + yearsHerosHaveAppeared);

		System.out.println("------------------------------------------------------------------------------------------------------");

		// Aufgabe T4

		List<Hero> allUniverses = Heroes.UNIVERSES.stream()
			.flatMap(universe -> universe.heroes())
			.collect(Collectors.toList());

		System.out.println("Alle Helden aus allen Universen: " + allUniverses.stream().map(Hero::name).collect(Collectors.joining(", ")));
		
		System.out.println("------------------------------------------------------------------------------------------------------");


	}

}
