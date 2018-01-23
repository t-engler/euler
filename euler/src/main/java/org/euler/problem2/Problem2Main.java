package org.euler.problem2;

public class Problem2Main {

	public static void main(String[] args) {
		long result = 0;

		long temp = 0;
		int index = 3;
		do {
			result += temp;
			temp = nthFibonacci(index);
			index += 3;
		} while (temp <= 4000000);

		System.out.println(result);
	}

	private static long nthFibonacci(int index) {
		double staticFactor = 1d / Math.sqrt(5d);
		double exponentBase = (1d + Math.sqrt(5d)) / 2d;

		double approximation = staticFactor * Math.pow(exponentBase, index);

		return Math.round(approximation);
	}

}
