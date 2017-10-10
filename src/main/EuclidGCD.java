/*
 * EuclidGCD Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement Euclid's Algorithm for finding the Greatest Common Denominator 
 *       using only addition and subtraction - no modulo, no multiplication, no division
 * Version  0.0.1   10/10/17
 */

package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclidGCD {
	
	/*
	 * Find the Greatest Common Denominator for two integers
	 * Using Euclid's Algorithm (recursive)
	 * @param A - any positive integer
	 * @param B - any positive integer
	 */
	private static int GCD(int A, int B) {
		// return zero for invalid input
		if (A < 0 || B < 0) {
			System.out.println("This program does not compute GCD for negative inputs.");
			return 0;
		}
		// if A == 0, return B
		if (A == 0)
			return B;
		// if B == 0, return A
		else if (B == 0)
			return A;
		// if A != 0 & B != 0
		else {
			// find the min and max input values
			// need this so we can do the proper "division" in findRemainder()
			int min, max;
			if (A > B) {
				min = B;
				max = A;
			}
			else {
				min = A;
				max = B;
			}
			// find the remainder of "division"
			int remainder = findRemainder(max,min);
			// call GCD with the smaller input value and the remainder
			return GCD(min,remainder);
		}
	}
	
	/*
	 * Finds the remainder of "division" by successive subtraction
	 * @param A - the larger of the two input integers
	 * @param B - the smaller of the two input integers
	 */
	private static int findRemainder(int A, int B) {
		// subtract the smaller from the larger until the next subtraction
		// would go below zero
		int remainder = A;
		while (remainder - B >= 0) {
			remainder -= B;
		}
		
		// return the remaining balance
		return remainder;
	}
	/*
	 * Main
	 * Get user input, process input, display results
	 */
	public static void main(String[] args) {
		// Set up input stream
		Scanner input = new Scanner(System.in);
		int firstInt, secondInt;
		
		// Get input from user
		System.out.println("This program will find the Greatest Common Denominator of two positive integers.");
		// do some basic input validation on the first input
		while (true) {
			System.out.print("Please enter the first integer from 0 to 2,147,483,647: ");
			try {
				firstInt = input.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("That is not a valid integer.");
			}
		}
		// do some basic input validation on the second input
		while (true) {
			System.out.print("Please enter the second integer from 0 to 2,147,483,647: ");
			try {
				secondInt = input.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("That is not a valid integer.");
			}
		}
		System.out.println("Processing...");
		
		// Call GCD method
		int gcdOut = GCD(firstInt,secondInt);
		
		// Print results
		System.out.println("The Greatest Common Denominator of " + firstInt + " and " + secondInt + " is: " + gcdOut);
		
		// Close input stream
		input.close();
	}

}
