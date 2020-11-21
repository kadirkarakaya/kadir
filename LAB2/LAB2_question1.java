package LAB2;
import java.util.Scanner;

public class LAB2_question1 {

	public static void main(String[] args) {
          
		
		int value ;
		
		int smallest = 0;
		
		int largest = 0;
		
         
		Scanner scan = new Scanner (System.in);
	    
		System.out.println(" Please enter a number:");
		
		value=scan.nextInt();
		
		System.out.println("Do you want to enter another number 0 = No, 1=Yes ");
		
		value=scan.nextInt();
		
		while(value == 1){							
			System.out.print("Enter a number: ");			
			value = scan.nextInt();
			if(value == 0){
				if (value > smallest){
					largest = value;
				}
				else{
					smallest =value;		
					
					System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
				}		
			}
			
			
			
		}
		
		
		
	}

	
		

	}


