package org.euler.problems.to0020;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.euler.common.Primes;
import org.euler.common.Products;
import org.euler.common.Sums;

/**
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first
 * ten terms would be:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers:
 * 
 * 1: 1 3: 1,3 6: 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28:
 * 1,2,4,7,14,28
 * 
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred
 * divisors?
 * 
 * @author User
 *
 */
public class Problem0012 {

	public static void main(String[] args) {
		long result = 0;
		int currentStep = 1;
		long limit = 500;
		double numberOfDivisors = 0;

		Map<Integer, Integer> lowerFactores;
		Map<Integer, Integer> upperFactores = Primes.factorizeInteger(currentStep);

		while (numberOfDivisors <= limit) {
			currentStep++;

			lowerFactores = upperFactores;
			upperFactores = Primes.factorizeInteger(currentStep);

			result = Sums.sumOfNToM(1, currentStep-1);

			Set<Integer> primeFactores = new TreeSet<Integer>();
			primeFactores.addAll(lowerFactores.keySet());
			primeFactores.addAll(upperFactores.keySet());

			List<Number> primeMultiplicity = new ArrayList<Number>();

			for (Integer currentInt : primeFactores) {
				int tempMultiplicity = lowerFactores.getOrDefault(currentInt, 0);
				tempMultiplicity += upperFactores.getOrDefault(currentInt, 0);
				tempMultiplicity++;
				if (currentInt == 2) {
					tempMultiplicity--;
				}
				primeMultiplicity.add(tempMultiplicity);
			}

			numberOfDivisors = Products.productOfList(primeMultiplicity);
			numberOfDivisors++;
		}

		System.out.println(result);
	}

}