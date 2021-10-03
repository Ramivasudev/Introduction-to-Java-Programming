package Exercise04;

/**
 *
 * @author Nishant (20CS029)
 * @email 20CS029@charusat.edu.in
 *(Find numbers divisible by 5 and 6) Write a program that displays all the 
 * numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
 * Numbers are separated by exactly one space.
*/
public class Exercise04_10 {
    public static void main(String[] args){
        
        // Declaring constant variable NUMBERS_PER_LINE that stores no. of numbers to be displayed per line
        final int NUMBERS_PER_LINE = 10;
        
        // Declaring count variable that will count the numbers which are divisible by 5 and 6 both from 100 to 1000
        int count = 0;
        
        //Test numbers from 100 to 1000
        for (int i = 100; i <= 1000; i++){
            
            //test number for it is divisible by 5 and 6
            if(i % 5 == 0 && i % 6 == 0){
                //increment count
                count++;

                if(count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }       
}
   
