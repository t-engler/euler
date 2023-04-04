package org.euler.problems.to0010;

import org.euler.common.Numbers;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author User
 *
 */
public class Problem0004 {

	public static void main(String[] args) {
		int result = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int tempResult = i * j;
				if (Numbers.isNumberPalindrome(tempResult) && tempResult > result) {
					result = tempResult;
				}
			}
		}

		System.out.println(result);
	}

}
