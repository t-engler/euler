package org.euler.problems.to0010;

import org.euler.common.Primes;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author User
 *
 */
public class Problem0007 {

	public static void main(String[] args) {
		long result = 0;
		int position = 10001;

		result = Primes.generateArrayOfPrimes(position)[position - 1];

		System.out.println(result);
	}

}
