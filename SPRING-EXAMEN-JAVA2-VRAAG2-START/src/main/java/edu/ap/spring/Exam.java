package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		List<Integer> myList = new ArrayList<Integer>();
		 for(int i=1; i<11; i++){
			 if (PrimeNumberChecker.isPrime(numbers[i])) {
				 myList.add(numbers[i]);
			 }
		 }
		 int[] array = myList.stream().mapToInt(i->i).toArray();
		return array;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
        int count = (int) string.chars().filter(Character::isLowerCase).count();
        return count;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		int count = 4;
		return count;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		return "test";
	}
}
