/*20cs040
shubhangi nakrani
 */
package Exercise05;
import java.util.Scanner;

public class Exercise05_04
{
    public static int reverse(int num)
    {
        //variable counter and reminder
        int a=0,r;
        //use loop
        while (num!=0)
        {
            //logic for reverse number
            //module use to get reminder
            r = num % 10;
            a = a * 10 + r;
            num = num/ 10;
        }
        //return number
        return a;
    }
    public static void main(String[] args) {
        //get the input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        //print output on console
        System.out.println("Reverse of given number is "+reverse(n));
    }
}
/*Enter number
3456
Reverse of given number is 6543

Process finished with exit code 0
*/
/*
Enter number
5698
Reverse of given number is 8965

Process finished with exit code 0

 */