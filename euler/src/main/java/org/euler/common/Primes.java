package org.euler.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Primes {

	public static Map<Integer, Integer> factorizeInteger(int i) {
		int currentVal = i;
		int currentDiv = 2;
		Map<Integer, Integer> primeFactorsMap = new TreeMap<Integer, Integer>();
		while (currentVal > 1) {
			if ((currentVal % currentDiv) == 0) {
				currentVal /= currentDiv;
				int currentFactorExp = primeFactorsMap.getOrDefault(currentDiv, 0);
				currentFactorExp++;
				primeFactorsMap.put(currentDiv, currentFactorExp);
			} else {
				currentDiv++;
			}
		}
		return primeFactorsMap;
	}

	public static boolean isNumberPrime(long potentialPrime) {
		if (potentialPrime < 2) {
			return false;
		}

		long ceiling = Math.round(Math.sqrt(potentialPrime));

		for (long i = 2; i <= ceiling; i++) {
			if ((potentialPrime % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static long[] generateArrayOfPrimes(int size) {
		long[] primeArray = new long[size];
		int position = 0;
		long currentNumberToCheck = 2;

		while (position < size) {

			primeArray[position] = currentNumberToCheck;
			position++;

			currentNumberToCheck = generateNextPrime(currentNumberToCheck);
		}

		return primeArray;
	}

	public static long generateNextPrime(long lastPrime) {
		long nextPrime = lastPrime + 1;
		while (!isNumberPrime(nextPrime)) {
			nextPrime++;
		}
		return nextPrime;
	}
	
	public static Long[] generateArrayOfPrimesBelowBound(long bound) {
		List<Long> primeList = new ArrayList<Long>();
		long currentPrime = 2;
		
		while(currentPrime < bound) {
			primeList.add(currentPrime);
			currentPrime = generateNextPrime(currentPrime);
		}
		
		return primeList.toArray(new Long[primeList.size()]);
	}
}