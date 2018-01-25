package org.euler.problems;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.euler.common.Primes;

/**
 * 
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author User
 *
 */
public class Problem5Main {

	public static void main(String[] args) {
		int upperLimit = 20;
		Map<Integer, Integer> primeFactorsMap = new TreeMap<Integer, Integer>();

		for (int i = 1; i <= upperLimit; i++) {
			Map<Integer, Integer> primeFactorizationMap = Primes.factorizeInteger(i);

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
