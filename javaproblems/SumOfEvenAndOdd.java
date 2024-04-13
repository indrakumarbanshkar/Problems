package problems;

import java.util.Scanner;

/*Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and 
odd digits are 1, 3, and 5.
Constraints
0<= 'n' <=10000 */
public class SumOfEvenAndOdd {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int digit=0;
	int even =0 , odd=0;
	while(n>0) {
		digit= n%10;
		n= n/10;   //  always give integer value not upto decimal.
	
	if(digit %2==0 ) {
		even = even+digit;
	}
	else {
		odd = odd+digit;
	}
			
}
	System.out.println(even + "  "+odd);
}
}
