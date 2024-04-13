package problems;

import java.util.Scanner;

/* Write a program that generates a multiplication table for a given integer.
 * The program should take an integer as input and print the first 10 multiples of the input integer. 
 * Each multiple should be printed on a new line. The program should not print anything else. 
 * The program should handle the case where the input integer is 0. In this case, 
 * the program should print ten lines of 0. 
 * The program does not need to handle invalid input. 
 * It can assume that the input will always be a valid integer within the specified constraints.*/
public class MultiplicationTable {

	public static void main(String[] args) {
	
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(i*n);
		}
		
	}

}
