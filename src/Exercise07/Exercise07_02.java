/*
 * @author SamirAli Mukhi 
 * S.ID: 20CS038
 * Email: 20cs038@charusat.edu.in
 */

/*
Exercise07_02: (Sum the major diagonal in a matrix) Write a method that sums all the numbers in
the major diagonal in an n X n matrix of integers values using the following header:                                                                        

public static double sumMajorDiagonal(double[][] m)                           

Write a test program that reads a 4-by-4 matrix and displays the sum of all   
its elements on the major diagonal. Here is a sample run:                                      
*/
package Exercise07;
import java.util.Scanner;

public class Exercise07_02 {
    // Main method
    public static void main(String[] args) {
        // Create a 4-by-4 matrix
	double[][] matrix = getMatrix();

	// Display the sum the major diagonal
	System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    // getMatrix returns a matrix initialized with user input
    public static double[][] getMatrix() {
	// Create a Scanner
	Scanner input = new Scanner(System.in);

	// Create a 4-by-4 matrix
	final int Rows = 4;
	final int Colums = 4;
	double[][] m = new double[Rows][Colums];
		
	// Prompt user to enter a 4-by-4 matrix
	System.out.println("Enter a 4-by-4 matrix row by row:");
	for (int r = 0; r < Rows; r++) {
	    for (int c = 0; c < Colums; c++) {
		m[r][c] = input.nextDouble();
            }
	}     
        return m;
    }

    // sumMajorDiagonal returns the sum of all the matrix elemets on the major diagonal
    public static double sumMajorDiagonal(double[][] m) {
	double sum = 0;
	for (int i = 0; i < m.length; i++) {
	    sum += m[i][i];
	}
	return sum;
    }
}

/*Output:
Enter a 4-by-4 matrix row by row:
1 2 3 4.0                            [Press Enter]
5 6.5 7 8                            [Press Enter]
9 10 11 12                           [Press Enter]
13 14 15 16                          [Press Enter]
Sum of the elements in the major diagonal is 34.5
*/