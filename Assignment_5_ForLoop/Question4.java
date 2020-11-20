package Assignment_5_ForLoop;

import java.util.Scanner ; 

public class Question4 {

	public static void main(String[] args) {
		 
		//Write a while loop that lets the user enter a number. The number should be multiplied by 10,
		//and the result stored in the variable product. 
		//The loop should iterate as long as product contains a value less than 100.
			 
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			int x ;
			int sum = 0;
			
		while(sum<100){
			
	System.out.println("Please enter number");
			
			x= scan.nextInt();
			
			sum=x*10;
			
	        System.out.println("Total value is: " + sum);
	        
		
			sum++;
		}
		
		    System.out.println("Result is not less than 100");
		}
	}
