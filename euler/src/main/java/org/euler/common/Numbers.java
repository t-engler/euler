package org.euler.common;

public class Numbers {
	
	public static boolean isNumberPalindrome(Integer potentialPrime) {
		char[] numberAsArray = potentialPrime.toString().toCharArray();

		for (int i = 0; i < numberAsArray.length; i++) {
			if (numberAsArray[i] != numberAsArray[numberAsArray.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}

}
