package Exercise04;

//(Conversion from miles to kilometers) Write a program that displays the following
//table (note that 1 mile is 1.609 kilometers):
//Miles           Kilometers
//1               1.609
//2               3.218
//...
//9               14.481
//10              16.090

/**
 * 
 *
 * @author Krish Pandya (D21CS109) 
 *
 */

public class Exercise04_04 {
	public static void main(String[] args) {
		// we are giving kilo value constant
		final double KILO = 1.609; 

		// the head display
		System.out.println("Miles\tKilometers");

		//converting miles into kilometer and displaying it
		for (int i = 1; i <= 10; i++) {
			//printing miles and giving spaces
			System.out.print(i + "\t");
			//multiplying miles into kilometer
			System.out.printf("%.3f \n", i*KILO);
		}
	}
}