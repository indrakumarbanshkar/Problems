package problems.patterns;

import java.util.Scanner;

public class AlphabetPattern {
	public static void main(String[] args) {
		
		
		/*
AAAA
BBBB
CCCC
DDDD
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int k=65;
		/* while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print((char)k);
				j++;
			}
			System.out.println();
			k=k+1;
			i++;
		}
		*/
		
		/*
Print the following pattern for the given N number of rows.

Pattern for N = 3
 A
 BB
 CCC
		 */
		
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print((char)k);
				j++;
			}
			System.out.println();
			k=k+1;
			i++;
		}
		
	}

}
