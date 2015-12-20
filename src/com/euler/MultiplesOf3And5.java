package com.euler;

/**
 * 
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author Naveen kumar
 *
 */
public class MultiplesOf3And5 {

	public static void printSum(int i, int j, int maxRange) {
		int sum = 0;
		for (int k = 3; k < maxRange; k++) {
			if(k%3 == 0 || k%5 == 0){
				sum+=k;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		printSum(3, 5, 1000);
	}
}
