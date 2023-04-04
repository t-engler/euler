package org.euler.common;

import java.math.BigInteger;
import java.util.List;

public class Products {
	public static double productOfArray(Number[] numberArray) {
		double result = 1;
		for (Number num : numberArray) {
			result *= num.doubleValue();
		}
		return result;
	}

	public static double productOfList(List<Number> numberList) {
		return productOfArray(numberList.toArray(new Number[numberList.size()]));
	}

	public static BigInteger faculty(int i) {
		BigInteger result = new BigInteger("1");

		while (i > 0) {
			result = result.multiply(new BigInteger("" + i));
			i--;
		}

		return result;
	}
}