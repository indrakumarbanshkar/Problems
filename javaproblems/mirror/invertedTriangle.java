package problems.mirror;

import java.util.Scanner;

/*
 
**** 
***  
**   
*  
 
  */


public class invertedTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	/*
	 
	**** 
	***  
	**   
	*  
	 
	  */
	

/*	
	int i=1;
	while(i<=n) {
		int stars=1;
		while(stars<=n-i+1) {
			System.out.print("*");
			stars++;
		}
		System.out.println();
		i++;
	}
	
	*/
	
	int i=1;
	while(i<=n) {
		int j=n-i+1;
		int num=j;
		while(j>0) {
			System.out.print(num);	
			j--;
		}
		
		System.out.println();
		i++;
	}
}
}
