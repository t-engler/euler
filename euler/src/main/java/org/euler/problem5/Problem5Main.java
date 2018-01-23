package org.euler.problem5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.euler.common.PrimeFactorizer;

public class Problem5Main {

	public static void main(String[] args) {
		int upperLimit = 20;
		Map<Integer, Integer> primeFactorsMap = new TreeMap<Integer, Integer>();

		for (int i = 1; i <= upperLimit; i++) {
			Map<Integer, Integer> primeFactorizationMap = PrimeFactorizer.factorizeInteger(i);

			for (Entry<Integer, Integer> primeFactorizationEntry : primeFactorizationMap.entrySet()) {
				int newVal = primeFactorizationEntry.getValue();
				int currentVal = primeFactorsMap.getOrDefault(primeFactorizationEntry.getKey(), 0);
				if (newVal > currentVal) {
					primeFactorsMap.put(primeFactorizationEntry.getKey(), newVal);
				} else {
					primeFactorsMap.put(primeFactorizationEntry.getKey(), currentVal);
				}
			}
		}

		int result = 1;
		for (Entry<Integer, Integer> primeFactorEntry : primeFactorsMap.entrySet()) {
			result *= Math.pow(primeFactorEntry.getKey(), primeFactorEntry.getValue());
		}

		System.out.println(result);
	}
}
