package org.euler.common;

public class Sums {

	public static long sumOfNToM(int n, int m) {
		long result = 0;

		result = ((m * (m + 1)) - (n * (n - 1))) / 2;

		return result;
	}

}
