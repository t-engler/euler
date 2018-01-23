package org.euler.problem3;

public class Problem3Main {

	public static void main(String[] args) {
		long result = 0;
		long number = 600851475143l;
		long divisorToTest = Math.round(Math.sqrt(number));
		long remainder = number % divisorToTest;
		boolean isPrime = isNumberPrime(divisorToTest);

		while (remainder != 0 || !isPrime) {
			divisorToTest--;
			isPrime = isNumberPrime(divisorToTest);
			remainder = number % divisorToTest;
		}

		System.out.println(number / divisorToTest);

		result = divisorToTest;

		System.out.println(result);
	}

	private static boolean isNumberPrime(long potentialPrime) {
		if (potentialPrime < 2) {
			return false;
		}

		long ceiling = Math.round(Math.sqrt(potentialPrime));

		for (long i = 2; i <= ceiling; i++) {
			if ((potentialPrime % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
