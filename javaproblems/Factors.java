package problems;

import java.util.Scanner;

/*Write a program that takes a number as input and prints all its factors except 1 and the number itself.. 
 * If the number has only two factors (1 and the number itself), then the program should print -1.*/
public class Factors {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int div = 2 ;
		boolean hasFactors = false;
		while(div<=n/2) {
			if(n%div==0) {
				hasFactors = true;
				System.out.println(div);
			}
			div++;
		}
		if (!hasFactors) {
            System.out.println("-1");
        }
		
	}

}
