package Assignment_5_ForLoop;

import java.util.Scanner ; 

public class Question6 {

	public static void main(String[] args) {
		//Write a program to print Fibonacci series of n terms 
		//where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 int count, num1 = 0, num2 = 1;
	        System.out.println("How may numbers you want in the sequence:");
	        Scanner scan = new Scanner(System.in);
	        count = scan.nextInt();
	        System.out.print("Fibonacci Series of "+count+" numbers:");

	        int i=1;
	        while(i<=count)
	        {
	            System.out.print(num1+" ");
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            i++;
	        }
	    }
	
	}


