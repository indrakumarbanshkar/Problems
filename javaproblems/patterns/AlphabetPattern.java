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
		
		/*		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print((char)k);
				j++;
			}
			System.out.println();
			k=k+1;
			i++;
		}               */
		
		
	/*	
		ABCD
		EFGH
		IJKL
		MNOP	*/
		
		
		
/*		while(i<=n) {
			int j=1;
			while(j<=n) {
				
				System.out.print((char)k);
				k=k+1;
				
				j++;
			}
			System.out.println();
			
			i++;
		}
		*/

		
		
		
/*
ABCD
BCDE
CDEF
DEFG
*/		
		
		
/*				
		while(i<=n) {
			int j=1;
		char p=(char)('A'+i-1);
			while(j<=n) {
				System.out.print(p);
				p=(char)(p+1);
				j++;
			}
			System.out.println();
			i++;	
			
		}*/
		
/*
A
BC
CDE
DEFG		
 */
		
/*		while(i<=n) {
			int j=1;
		char p=(char)('A'+i-1);
			while(j<=i) {
				System.out.print(p);
				p=(char)(p+1);
				j++;
			}
			System.out.println();
			i++;	
			
		}	
		
	*/
		
		/*
E
DE
CDE
BCDE
ABCDE

or

5
45
345
2345
12345
		 */
		int num = n;
		while(i<=n) {
			int j=1;
			int start= 'A'+num-1;
			while(j<=i) {
				System.out.print((char)(start));
				j++;
				start++;
			}
			System.out.println();
			num--;
			i++;	
			
		}
	}
}
