package problems.isocelestriangle;

import java.util.Scanner;

public class IsocelesTriangle {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	
	/* 
	   1
	  121
	 12321
	1234321
	  */
	
/*	
	
	int i=1;
	while(i<=n) {
	
		int spaces=1;
		while(spaces<=n-i) {
			System.out.print(" ");
			spaces++;
		}
		int num=1;
		while(num<=i) {
			System.out.print(num);
			num++;
		}
		
		int dec= i-1;
		while(dec>=1) {
			System.out.print(dec);
			dec--;
		}		
		System.out.println();
		i++;
	}	
	
	                 
	                 */
	
	
	/*
	  
   *
  ***
 *****
*******
	 */
	
/*	
	int i=1;
	while(i<=n) {
	
		int spaces=1;
		while(spaces<=n-i) {
			System.out.print(" ");
			spaces++;
		}
		int stars=1;
		while(stars<=i) {
			System.out.print("*");
			stars++;
		}
		
		int dec= i-1;
		while(dec>=1) {
			System.out.print("*");
			dec--;
		}		
		System.out.println();
		i++;
	}	
	
	*/
	
	

	
	
	int i=1;
	while(i<=n) {
	
		int spaces=1;
		while(spaces<=n-i) {
			System.out.print(" ");
			spaces++;
		}
		int num=i;
		int j=1;
		while(j<=i) {
			System.out.print(num);
			num++;
			j++;
		}
	    int k = i;
	    k -= 2;
        while (k >= i) {
            System.out.print(k);
            k--;
        }	
		
		
		System.out.println();
		i++;
	}	
	
	
	
}
}
