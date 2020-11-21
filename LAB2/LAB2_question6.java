package LAB2;

import java.util.Scanner;

public class LAB2_question6 {

	public static void main(String[] args) {
		 
		
		/* Write a program that will ask the user to enter the amount of a purchase. 
		 * The program should then compute the state and county tax sales tax. 
		 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		 * The program should display the amount of the purchase , the state sales tax, 
		 * the county sales tax, the total sales tax, and " 
		 * (which is the sum of the amount of purchase plus the total sales tax)
		 */

        Scanner scan = new Scanner ( System.in);
		
		System.out.println("Please enter the amount of a purchase: ");
		
	    double AmountOfPurchase = scan.nextDouble();
	    
	    double StateTax = ((4.0/AmountOfPurchase)*100);
	    
	    double CountryTax = ((2.0/AmountOfPurchase)*100);
	    
	    double TotalSaleTax = StateTax + CountryTax ;
	    
	    double Amount = (AmountOfPurchase + TotalSaleTax);

	    System.out.println("amount of the purchase: " + AmountOfPurchase + " $ "+ "the state sales tax: "
	    + StateTax+  " $ "+" the county sales tax: "+ CountryTax +  " $ "+" the total sales tax: "
	    +TotalSaleTax+ " $ "+" the total of the sale: " + Amount );
	    
	}

}
