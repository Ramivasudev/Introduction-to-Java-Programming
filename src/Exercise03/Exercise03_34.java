


package Exercise03;
import java.util.Scanner;


/* 
*
*
*@author: Khushi Minipara (20CS036)
*email : 20CS036@charusat.edu.in
*
*Exercise 3.32 shows how to test whether a point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on a line segment. 
Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1
*
*
*/
public class Exercise03_34
{
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);

         //inputing values of 3 points from the user

         System.out.println("Enter three points for p0,p1,and p2:");

         double x0=sc.nextDouble();
         double y0=sc.nextDouble();
         double x1=sc.nextDouble();
         double y1=sc.nextDouble();
         double x2=sc.nextDouble();
         double y2=sc.nextDouble();

         //representing points in the form of coordinates
         
         String p0="("+ x0 + "," + y0 +")";
         String p1="("+ x1 + "," + y1 +")";
         String p2="("+ x2 + "," + y2 +")";

         String s="not";
         
         if (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1))  && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1)))
         {
            double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
                if (c == 0) 
                {
                    s = " ";
                }
        }

  //printing the output statement
  System.out.println(p2 + "is" + s + "on the line segment from " + p0 + " to " + p1);

    }
}



    
