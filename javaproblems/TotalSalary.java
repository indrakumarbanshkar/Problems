package problems;

import java.util.Scanner;

/*  Write a program to calculate the total salary of a person. 
 * The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
 * depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only.
I/P - Basic Salary and Grade Pay
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
*/
public class TotalSalary {
        static double  total_salary=0;
        static float Basic;
        static double HRA;
        static double DA ;
        static double Allow=0;
        static double PF;
        static char grade;
        
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    Basic = sc.nextFloat();
		    grade = sc. next(). charAt(0);
		    HRA = 0.2* Basic;
		    DA= 0.5*Basic;
		    PF= 0.11* Basic;
		    if(grade=='A') {
		    	Allow=1700;
		    }
		    else if(grade=='B') {
		    	Allow=1500;
		    }
		    else if(grade=='C') {
		    	Allow=1300;
		    }else {
		    	Allow=1300;
		    }
			
		    total_salary = (Basic + HRA + DA + Allow )- PF;
		    System.out.println(total_salary);
		    
	}

}
 /*public class Main {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int basic =sc.nextInt();
		char grade=sc.next().charAt(0);
		int a=basic;
		int allow=1300;
		double hra=(0.2d*basic);
		double da=(0.5d*basic);
		if(grade=='A'){
			allow=1700;
			
		}else if(grade=='B'){
			allow=1500;

		}
		double pf=(0.11d*basic);
		double totalSalary=a+hra;
		totalSalary +=da;
		totalSalary +=allow;
		totalSalary -=pf;
		System.out.println(Math.round(totalSalary));

	}
}
*/
