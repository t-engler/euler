package org.euler.problems.to0020;

import java.math.BigInteger;

import org.euler.common.Products;

/**
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * @author User
 *
 */
public class Problem0015 {

	public static void main(String[] args) {
		BigInteger result;
		int gridSize = 20;

		result = Products.faculty(gridSize*2).divide(Products.faculty(gridSize).pow(2));

		System.out.println(result);
	}

}