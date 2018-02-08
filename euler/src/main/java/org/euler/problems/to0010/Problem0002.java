package org.euler.problems.to0010;

import org.euler.common.Sequences;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author User
 *
 */
public class Problem0002 {

	public static void main(String[] args) {
		long result = 0;

		long temp = 0;
		int index = 3;
		do {
			result += temp;
			temp = Sequences.nthFibonacci(index);
			index += 3;
		} while (temp <= 4000000);

		System.out.println(result);
	}

}
