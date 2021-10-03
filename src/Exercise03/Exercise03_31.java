/*
*
*@author : Disha Patel
*@email : <20cs048@charusat.ac.in>
*
*
*(Financials: currency exchange) Write a program that prompts the user to enter
*the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
*to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
*Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
*or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
*
*/
package Exercise03;

import java.util.Scanner;

public class Exercise03_31 
{
	public static void main(String[] args) 
	{
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the exchange rate from USD to RMB
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		// Prompt the user to enter 0 to convert from USD to RMB
		// and 1 to convert from RMB to USD
		System.out.print("Enter 0 to convert dollars to RMB and 1 to convert RMB to dollars : ");
		int option = input.nextInt();

		// Prompt the user to enter the amount in USD or RMB
		// to convert it to RMB or USD respectively
		double amount;
		switch(option)
		{
			case 0: System.out.print("Enter the dollar amount: ");
					  amount = input.nextDouble();
					  System.out.println("$" + amount + " is " + 
					  	(amount * rate) + " yuan"); break;
			case 1: System.out.print("Enter the RMB amount: ");
					  amount = input.nextDouble();
					  System.out.println(amount + " yuan is $" + 
					  	((int)((amount * 100) / rate)) / 100.0); break;
			default: System.out.println("Incorrect input");
		} 
	}
}
