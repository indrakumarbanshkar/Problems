package problems.patterns;

import java.util.Scanner;
/*
 Print the following pattern for the given N number of rows.

Pattern for N = 4
1
21
321
4321
 */

public class ReverseNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<=n) {
			int m=i;
			int j=1;
			while(j<=i) {
				System.out.print(m);
				m--;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
