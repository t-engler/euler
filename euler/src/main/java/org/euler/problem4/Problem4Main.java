package org.euler.problem4;

public class Problem4Main {

	public static void main(String[] args) {
		int result = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int tempResult = i * j;
				if (isNumberPalindrome(tempResult) && tempResult > result) {
					result = tempResult;
				}
			}
		}

		System.out.println(result);
	}

	private static boolean isNumberPalindrome(Integer potentialPrime) {
		char[] numberAsArray = potentialPrime.toString().toCharArray();

		for (int i = 0; i < numberAsArray.length; i++) {
			if (numberAsArray[i] != numberAsArray[numberAsArray.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}
}
