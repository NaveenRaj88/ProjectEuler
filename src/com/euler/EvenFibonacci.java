package com.euler;

/**
 * 
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author Naveen kumar
 *
 */
public class EvenFibonacci {

	public static void printEvenValuesFibonnacciSum(int maxRange) {
		int i = 0, j = 1, z = 0, sum = 0;
		while ((z=i+j)<maxRange) {
			if (z % 2 == 0) {
				sum += z;
			}
			i = j;
			j = z;
		}
		//System.out.println(z);
		System.out.println(z);
		System.out.println(j);
		System.out.println(sum);
	}

	public static void main(String[] args) {	
		printEvenValuesFibonnacciSum(4000000);
	}
}
