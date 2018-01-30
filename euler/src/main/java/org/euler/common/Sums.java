package org.euler.common;

import java.util.List;

public class Sums {

	public static long sumOfNToM(int n, int m) {
		long result = 0;

		result = ((m * (m + 1)) - (n * (n - 1))) / 2;

		return result;
	}
	
	public static double sumOfArray(Number[] numberArray) {
		double result = 0;
		for(Number num : numberArray) {
			result += num.doubleValue();
		}
		return result;
	}
	
	public static double sumOfList(List<Number> numberList) {
		return sumOfArray( numberList.toArray(new Number[numberList.size()]));
	}
}
