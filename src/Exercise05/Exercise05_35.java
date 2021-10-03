package exercise05;
import java.util.Scanner;

/*
 * @author vraj nagarsheth(20cs039)
The area of a pentagon can be computed using the
 * following formula:
 * Area = 5 * s^2 / 4 * tan(PI/5)
 * Write a method that returns the area of a pentagon using the following header:
 * public static double area(double side)
 * Write a main method that prompts the user to enter the side of a pentagon and
 * displays its area. Here is a sample run:
 * Enter the side: 5.5
 * The area of the pentagon is 52.04444136781625
 *
 */
public class Exercise05_35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of pentagon: ");  //user enters side of the pentagon
        double side=sc.nextDouble();
        System.out.println("The area of pentagon is "+ area_pentagon(side));
        
    }
    //method to calculate area of pentagon
    public static double area_pentagon(double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        
    }
       

}
