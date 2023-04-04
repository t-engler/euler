package org.euler.common;

public class Sequences {
	public static long nthFibonacci(int index) {
		double staticFactor = 1d / Math.sqrt(5d);
		double exponentBase = (1d + Math.sqrt(5d)) / 2d;

		double approximation = staticFactor * Math.pow(exponentBase, index);

		return Math.round(approximation);
	}
}