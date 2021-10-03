package Exercise05;

/*
*@author Deekshita katada (20CS024)
*(Financial application: compute commissions) Write a method that computes the
*commission, using the scheme in Programming Exercise 4.39. The header of the
*method is as follows:
*public static double computeCommission(double salesAmount)
*Write a test program that displays the following table:
*Sales Amount Commission 
*10000 900.0
*15000 1500.0
*...
*95000 11100.0
*100000 11700.0
*/

public class Exercise05_11 {
	
    //class main method
	public static void main(String[] args) {
		
		System.out.println("Sales  Commission Amount");
		// Display table using for loop 
		for (int sales = 10000; sales <= 100000; sales += 5000) 
		{
			System.out.print(sales);
            System.out.print("     ");
            System.out.printf("%.1f\n", computeCommission(sales));
            }
	}
	
// Method commputeCommission computes the commission 
public static double computeCommission(double salesAmount) {
	
	// initialising the value of commission to 0
	double commission = 0;
	
	// If sales amount is $5000 and less commission rate is 8%
	if (salesAmount <= 5000)
	{
		commission = salesAmount * 0.08;
		
	} 
	
	// If sales amount is $10.000 and above commission rate is 10%
	else if (salesAmount <= 10000) 
	{
		salesAmount -= 5000;
        commission = (salesAmount * .10)+ (5000 * 0.08);
    }
	
	// If sales amount is above $10.000 commission rate is 12%
	else if (salesAmount > 10000) 
	{
		commission = (5000 * 0.08);
		commission = (5000 * .10)+ (5000 * 0.08);
        salesAmount -=10000;
        commission = (salesAmount * .12)+ (5000 * .10)+(5000 * 0.08);
    }
	
	//returning the value of commission
	return commission;
	}
}
