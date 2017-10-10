/*
 * EuclidGCD Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement Euclid's Algorithm for finding the Greatest Common Denominator 
 *       using only addition and subtraction - no modulo, no multiplication, no division
 * Version  0.0.1   10/10/17
 */

package main;

public class EuclidGCD {
	
	/*
	 * Find the Greatest Common Denominator for two integers
	 * Using Euclid's Algorithm (recursive)
	 * @param A - any positive integer
	 * @param B - any positive integer
	 */
	private int GCD(int A, int B) {
		// if A == 0, return B
		// if B == 0, return A
		// if A != 0 & B != 0
		//     find the remainder of division
		//     call GCD with the smaller number and the remainder
		return 0;
	}
	
	/*
	 * Finds the remainder of division by successive subtraction
	 * @param A - any positive integer
	 * @param B - any positive integer
	 */
	private int findRemainder(int A, int B) {
		// find the larger of the two integers
		// subtract the smaller from the larger until the next subtraction
		//     would go below zero
		// return the remaining balance
		return 0;
	}
	/*
	 * Main
	 * Get user input, process input, display results
	 */
	public static void main(String[] args) {
		// Set up input stream
		// Get input from user
		// Call GCD method
		// Print results
	}

}
