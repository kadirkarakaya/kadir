package LAB2;
import java.util.Scanner;

public class LAB2_question2 {

	public static void main(String[] args) {
		 
		  Scanner scan = new Scanner (System.in);

	       System.out.println("How many cookies did you eat today");

	       int numOfCookies = scan.nextInt();

	       int numCalories = (numOfCookies*300)/4; 

	       System.out.println("The total number of calories you ate today is : "+numOfCookies+" and cookies has calories: " + " "+numCalories);

	   }

	
		

	}


