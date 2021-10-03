package Exercise06;

/*
 * @author Kevin Colaco (20CS013)
 * 
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * distinct numbers (i.e., if a number appears multiple times, it is displayed only
 * once). (Hint: Read a number and store it to an array if it is new. If the number is
 * already in the array, ignore it.) After the input, the array contains the distinct numbers.
 */

import java.util.Scanner;

public class Exercise06_05
{
    public static void main(String[] args)
    {
        // Initialized two arrays 
        int[] numberArray = new int[10];
        int[] distinctArray = new int[10];

        // Declared two variables for "for loop", a scanner to get input from user and count to get the distinct numbers
        int i, j;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        // Getting the 10 numbers from user
        System.out.print("Enter ten numbers: ");
        for (i = 0; i < 10; i++) {
            numberArray[i] = scanner.nextInt();
        }

        // Looping through to get distinct array from the user array 
        for (i = 0; i < 10 ; i++)
        {
            for (j = 0; j < i; j++) {
                if (numberArray[i] == numberArray[j]) {
                    break;
                }
            }
                
            if (i == j) {
                distinctArray[count] = numberArray[i];
                count++;
            }
        }

        // Printing the distinct array 
        System.out.print("The distinct numbers are: ");

        for (i = 0; i < count; i++) {
            System.out.print(distinctArray[i] + " ");
        }
    }
}