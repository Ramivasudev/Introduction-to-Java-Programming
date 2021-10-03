package com.company;
import java.util.Scanner;
import java.lang.Math;

//Chapter 5 Exercise 19 :
//        (The MyTriangle class) Create a class named MyTriangle that contains the
//        following two methods:
///** Return true if the sum of any two sides is
// * greater than the third side. */
//public static boolean isValid(
//        double side1, double side2, double side3)
///** Return the area of the triangle. */
//public static double area(
//        double side1, double side2, double side3)

/*
*
*
* @author Tanay Deo 20CS014
*
*/

public class Exercise05_19 {

    public static void main(String[] args) {

        /* Declaring the three side variables to store the value of all the three sides of a triangle given by the user */
        double side1;
        double side2;
        double side3;

        /* Getting input from the user for the three sides of the triangle */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of side 1 : ");
        side1 = sc.nextDouble();
        System.out.print("Enter value of side 2 : ");
        side2 = sc.nextDouble();
        System.out.print("Enter value of side 3 : ");
        side3 = sc.nextDouble();

        /* Checking if the triangle is valid or not using the isValid method  */
        if(isValid(side1,side2,side3) == true) {

            /* Printing the area of the triangle using the area method if the triangle is valid */
            System.out.print("The Area of the triangle with the given sides is : "+area(side1,side2,side3));
        }
        else {

            /* Printing an error message if the user nput is invalid */
            System.out.println("Input is Invalid");
        }
    }



    /** Return true if the sum of any two sides is
     * greater than the third side. */
    public static boolean isValid(double side1, double side2, double side3) {

        /* validSide is a boolean variable which stores the value that is the the given triangle valid or not */
        boolean validSide = side1+side2>side3 && side1+side3>side2 && side2+side3>side1;
        return validSide;
    }

    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {

        /* Writing the formula to calculate the area of the triangle */
        double s = (side1+side2+side3)/2;

        /* Calculating the area of the triangle */
        double areaOfTriangle = Math.sqrt((s*side1)+(s*side2)+(s*side3));
        return areaOfTriangle;
    }
}