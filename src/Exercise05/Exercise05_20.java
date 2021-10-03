/*
 *@author : Disha Patel
 *@email : <20cs048@charusat.ac.in>
 *ID: 20CS048
 *
 * (Use trigonometric methods) Print the following table to display the sin value and
 * cos value of degrees from 0 to 360 with increments of 10 degrees. Round the
 * value to keep four digits after the decimal point.
 * Degree Sin Cos
 * 0    0.0000 1.0000
 * 10   0.1736 0.9848
 * ...
 * 350 -0.1736 0.9848
 * 360  0.0000 1.0000
 *
 *
 */
package Exercise05;
public class Exercise05_20
 {
    public static void main(String[] args) 
	{
		//Printing Output
        System.out.println("\n Degree       Sine        Cosine");
        System.out.println("________________________________");
		
		//Declaring variable
        int i=0;
            //Printing i.
            System.out.print(" "+i+"            ");
            //Printing the sine value of i using float to round the value to keep four digits after the decimal point.
            System.out.printf("%-6.4f      ",sine(i));
             //Printing the cosine value of i using float to round the value to keep four digits after the decimal point.
            System.out.printf("%-6.4f\n", cosine(i));
			
		
         //Using for loop   
         for(i=10; i<=90; i++) 
		 {
             //Printing the value of i which starts from 10.
            System.out.print(" "+i+"           ");
            //Printing the sine value.
            System.out.printf("%-6.4f      ",sine(i));
            //Prining cosine value in new line .
            System.out.printf("%-6.4f\n", cosine(i));
            //Increment the degrees by 10.
            i = i+9;
         }
         //Using for loop   
         for(i=100; i<=180; i++) 
		 {
             //Printing the value of i which starts from 100.
            System.out.print(" "+i+"          ");
            //Printing the sine value.
            System.out.printf("%-6.4f     ",sine(i));
            //Prining cosine value in new line .
            System.out.printf("%-6.4f\n", cosine(i));
            //Increment the degrees by 10.
            i = i+9;
         }
         for(i=190; i<=270; i++)
		 {
            System.out.print(" "+i+"         ");
            //Printing the sine value.
            System.out.printf("%-6.4f     ",sine(i));
            //Prining cosine value in new line .
            System.out.printf("%-6.4f\n", cosine(i));
            //Increment the degrees by 10.
            i = i+9;
         }
         for(i=280; i<=360; i++) 
		 {
            System.out.print(" "+i+"         ");
            //Printing the sine value.
            System.out.printf("%-6.4f      ",sine(i));
            //Prining cosine value in new line .
            System.out.printf("%-6.4f\n", cosine(i));
           //Increment the degrees by 10.
            i = i+9;
         }
    }
    
        
    public static double sine(double i) 
    {
    //It will return the trigonometric cosine of an angle.
      double sinAngle = Math.sin(i/180*Math.PI);
      return sinAngle;
    } 

    public static double cosine(double i) 
    {
     //It will return the trigonometric cosine of an angle.
     double cosAngle = Math.cos(i/180*Math.PI);
      return cosAngle;
    }
}
