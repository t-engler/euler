package org.euler.problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author User
 *
 */
public class Problem9Main {

	public static void main(String[] args) {
		int result = 0;
		int upperBound = 1000;

		for (int a = 1; a <= (upperBound / 3); a++) {
			for (int b = a + 1; b <= (upperBound / 2); b++) {
				int c = upperBound - a - b;
				if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					result = a * b * c;
					break;
				}
			}
			if (result > 0) {
				break;
			}
		}

		System.out.println(result);
	}

}
