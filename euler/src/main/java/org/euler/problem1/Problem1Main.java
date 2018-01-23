package org.euler.problem1;

import java.util.Set;
import java.util.TreeSet;

public class Problem1Main {

	public static void main(String[] args) {
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		
		for(int i = 3; i < 1000; i+=3) {
			setOfNumbers.add(i);
		}
		
		for(int i = 5; i < 1000; i+=5) {
			setOfNumbers.add(i);
		}
		
		int result = setOfNumbers.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(result);
	}
	
}
