package problems;

import java.util.Scanner;

/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. 
 * You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32

*/
public class PowerOfNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x= sc.nextInt();
	int n= sc.nextInt();
	int p=1;
	for(int i=1; i<=n; i++) {
		
		p=p*x;
		
	}
	System.out.println(p);
}
}
