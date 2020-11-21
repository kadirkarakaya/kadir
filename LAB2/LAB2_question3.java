package LAB2;

import java.util.Scanner;

public class LAB2_question3 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter positive number : ");
		
		int sum =0;
		 
		int x = scan.nextInt();
     
        if (x <= 0  ) {
        	 
           System.out.println("You didn't enter a positive number");
        
		
	} else {
		
		for( int number =1; number <= x ; number++ )    
	        sum = sum + number;

	}
         System.out.println(sum);
}
}