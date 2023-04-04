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

	public static long calculateProductOfDigits(String number) {
		if (number.contains("0")) {
			return 0;
		}

		long result = 1;

		for (char c : number.toCharArray()) {
			result *= Long.parseLong(String.valueOf(c));
		}

		return result;
	}
}