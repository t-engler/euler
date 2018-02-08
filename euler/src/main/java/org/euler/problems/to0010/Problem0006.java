package org.euler.problems.to0010;

import org.euler.common.Sums;

/**
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385
 * 
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author User
 *
 */
public class Problem0006 {

	public static void main(String[] args) {
		long result = 0;
		int upperBound = 100;

		for (int n = 1; n <= upperBound; n++) {
			result += 2 * n * Sums.sumOfNToM(n + 1, upperBound);
		}

		System.out.println(result);
	}

}
