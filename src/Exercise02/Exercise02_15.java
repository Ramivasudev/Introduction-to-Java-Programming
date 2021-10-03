package Exercise02;

import java.util.Scanner;

/**
 * Khushi Minipara - 20cs036
 * 
 * (Geometry:  area  of  a  triangle)  Write  a  program  that  prompts  the  user  to  enter
 * three points (x1, y1),(x2, y2),(x3, y3)of a triangle and displays its area.
 * The formula for computing the area of a triangle is:
 * s=(side1+side2+side3)/2
 * area=2s(s-side1)(s-side2)(s-side3);
 * 
 */

public class Exercise02_15 {

    public static void main(String []args) 
    {
        Scanner input = new Scanner(System.in);
        //inputing value of x1 and y1 from the user
        System.out.println("Enter x1 and y1: ");
        double x1, x2, y1, y2, x3, y3;

        x1 = input.nextDouble();
        y1 = input.nextDouble();

        //inputing value of x2 and y2 from the user
        System.out.println("Enter x2 and y2: ");

        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        //inputing value of x3 and y3 from the user
        System.out.println("Enter x3 and y3: ");

        x3 = input.nextDouble();
        y3 = input.nextDouble();

        //finding the sides of the triangle
       double side1=Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2),0.5);
       double side2=Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
       double side3=Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
       
       // finding semi-permieter
       double s = (side1 + side2 + side3)/2;

       //finding area
       double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
       
       //printing area
       System.out.println("The area of the trainagle is:" + area);

    }

}