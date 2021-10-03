/*
 * @author : Disha Patel
 * @email : <20cs048@charusat.ac.in>
 *
 *
 *(Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 *
 * 
 */
 package Exercise03;

import java.util.Scanner;

 public class Exercise03_35 
{
	public static void main(String[] args)
	{
		//Use of scanner class for input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer between 0 and 15
		System.out.print("Enter a decimal value: ");
		int decimal = input.nextInt();

		// Display its corresponding hex number
		if (decimal >= 0 && decimal <= 9)
		//Printing the hexa decimal value.
		    System.out.println("The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
		    System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
		else
			System.out.println(decimal + " is an invalid input");
	}
}