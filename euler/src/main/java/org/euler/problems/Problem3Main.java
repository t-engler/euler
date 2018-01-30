package org.euler.problems;

import org.euler.common.Primes;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author User
 *
 */
public class Problem3Main {

	public static void main(String[] args) {
		long result = 0;
		long number = 600851475143l;
		long divisorToTest = Math.round(Math.sqrt(number));
		long remainder = number % divisorToTest;
		boolean isPrime = Primes.isNumberPrime(divisorToTest);

		while (remainder != 0 || !isPrime) {
			divisorToTest--;
			isPrime = Primes.isNumberPrime(divisorToTest);
			remainder = number % divisorToTest;
		}

		System.out.println(number / divisorToTest);

		result = divisorToTest;

		System.out.println(result);
	}

}
