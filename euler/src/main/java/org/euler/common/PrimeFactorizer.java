package org.euler.common;

import java.util.Map;
import java.util.TreeMap;

public class PrimeFactorizer {

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

}
