package org.euler.problems;

import org.euler.common.Primes;
import org.euler.common.Sums;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author User
 *
 */
public class Problem10Main {

	public static void main(String[] args) {
		long result = 0;
		long upperBound = 2000000;

		result = (long) Sums.sumOfArray(Primes.generateArrayOfPrimesBelowBound(upperBound));

		System.out.println(result);
	}

}