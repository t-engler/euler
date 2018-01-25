package org.euler.common;

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

}
