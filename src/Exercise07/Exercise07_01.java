package Exercise07;
/*
shubhangi nakrani
20cs40
 */
import java.util.Scanner;

public class Exercise07_01
{
    public static double sumColumn(double[][] m, int i)
    {
        //variable declaration
        double s;
        //made array
        s = m[0][i]+m[1][i]+m[2][i];
        //return result
        return s;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //2d array
        double[][] a =new double[3][4];
        //enter 1 row
        System.out.println("Enter first row");
        //for loop for first row
        for(int i=0;i<4;i++)
        {
            a[0][i]=s.nextDouble();
        }
        System.out.println("Enter second row");
        //for loop for second row
        for(int i=0;i<4;i++)
        {
            a[1][i]=s.nextDouble();
        }
        //for loop for third row
        System.out.println("Enter third row");
        for(int i=0;i<4;i++)
        {
            a[2][i]=s.nextDouble();
        }
        //prints the all value
        System.out.println("Sum of first column is "+sumColumn(a,0));
        System.out.println("Sum of second column is "+sumColumn(a,1));
        System.out.println("Sum of third column is "+sumColumn(a,2));
        System.out.println("Sum of fourth column is "+sumColumn(a,3));
    }
}
/*
Enter first row
1.5 2 3 4
Enter second row
5.5 6 7 8
Enter third row
9.5 1 3 1
Sum of first column is 16.5
Sum of second column is 9.0
Sum of third column is 13.0
Sum of fourth column is 13.0

Process finished with exit code 0

 */