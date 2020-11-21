package LAB2;

import java.util.Scanner;

public class LAB2_question4 {

	public static void main(String[] args) {
		
		/* Write a program that asks user for the number of males and the number of females registered in a class. 
		 The program should display the percentage of males and females in the class.*/
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Please enter number of Males in classroom :");
		 double numberOfMales = scan.nextDouble();
		 System.out.println("Please enter number of Females in classroom :");
		 double numberOfFemales = scan.nextInt();
		 
         double Total = numberOfMales + numberOfFemales ;
         
         Double PercofMale = ((numberOfMales/Total)*100);
         Double PercoFemale = ((numberOfFemales/Total)*100);
         
         System.out.println("Percentage of Males : % "+PercofMale);
         System.out.println("Percentage of Females : % "+ PercoFemale);
	}

}
