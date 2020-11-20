package Assignment_5_ForLoop;

import java.util.Scanner ;

public class Question8 {

	public static void main(String[] args) {
		 
		//Write a program to calculate the sum of the numbers from 1 till upper bound.
		//If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		//If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
		//If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		//You should use a while loop.
		
		Scanner scan = new Scanner(System.in);
		int usernumber = -1; 
		int sum = 0;
		
		while(usernumber<1) {
                    System.out.println("Please enter positive number");
        usernumber = scan.nextInt()  ;  
		}		            
        for( int number =1; number <= usernumber ; number++ )    
        sum = sum + number;
		
		System.out.println(usernumber + sum);
	}
		 
		}
	     
	


