/*
 * EuclidGCD Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement Euclid's Algorithm for finding the Greatest Common Denominator 
 *       using only addition and subtraction - no modulo, no multiplication, no division
 * Version  0.0.1   10/10/17
 */

package main;

import java.util.Scanner;

public class EuclidGCD {
	
	/*
	 * Find the Greatest Common Denominator for two integers
	 * Using Euclid's Algorithm (recursive)
	 * @param A - any positive integer
	 * @param B - any positive integer
	 */
	private static int GCD(int A, int B) {
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
	private static int findRemainder(int A, int B) {
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
		Scanner input = new Scanner(System.in);
		
		// Get input from user
		System.out.println("This program will find the Greatest Common Denominator of two integers.");
		System.out.print("Please enter the first integer: ");
		int firstInt = input.nextInt();
		System.out.print("Please enter the second integer: ");
		int secondInt = input.nextInt();
		System.out.println("Processing...");
		
		// Call GCD method
		int gcdOut = GCD(firstInt,secondInt);
		
		// Print results
		System.out.println("The Greatest Common Denominator of " + firstInt + " and " + secondInt + " is: " + gcdOut);
		
		// Close input stream
		input.close();
	}

}
