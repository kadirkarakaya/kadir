package LAB2;

import java.util.Scanner;

public class LAB2_question5 {

	public static void main(String[] args) {
		 
		/*Write a program that computes the tax and tip on a restaurant bill. 
		The program should ask the user to enter the charge for the meal. 
		The tax should be 6.75 percent of the meal charge.
		The tip should be 20 percent of the total after adding tax. 
		Display the meal charge, tax amount, tip amount, and total bill on the screen.*/
		
       
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Please enter price of the meal: ");
		
	    double ChargeOfMeal = scan.nextDouble();
	    
	    double Tax = ((6.7/ChargeOfMeal)*100);
	    
	    double Tip = ((0.20/ChargeOfMeal)*100);
	    
	    double Amount = (ChargeOfMeal+Tax+Tip);
	    
	    System.out.println("meal charge:"+ChargeOfMeal + " $ " + "tax amount:" + Tax + " $" + "tip amount:"+Tip +" $"+" and Total bill is " + Amount+" $");

}
}