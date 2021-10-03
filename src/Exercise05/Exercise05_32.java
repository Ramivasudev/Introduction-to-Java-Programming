package Exercise05;


import java.util.*;

/*
@author: Harshive Patel
email : 20cs051@charusat.edu.in 
Id: 20cs051
*/
/*
---------------------------------------------Exercise05_32-------------------------------------------------
(Game: craps) Craps is a popular dice game played in casinos. Write a program to
play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
(Game: chance of winning at craps) Revise Exercise 5.30 to run it 10,000 times
and display the number of winning games
*/
public class github {
    public static void main(String[] args) {

        int win = 0;// defining win variable as int for storing the winning count
        int lose = 0;// defining lose variable as int for storing the lose count
        int point;// defining point variable as int datatype

        for (int i = 0; i < 10000; i++) {// for loop starts
            Random random = new Random();// Declaring random reference of random class

            int r1 = random.nextInt(6) + 1;// taking random input as int as r1 variable
            int r2 = random.nextInt(6) + 1;// taking random input as int as r2 variable

            int score = r1 + r2;// Adding the r1 and r2 and storing it score variable as int
            if (score == 7 || score == 11) {// if else if ladder starts
                win++;// counting the winning count if the condtion satisfies
            } else if (score == 2 || score == 3 || score == 12) {
                lose++;// counting the losing count if the else if conditon satisfies
            } else {
                point = score;// point condition has occured
                while (true) {// while loop starts

                    int r3 = random.nextInt(6) + 1;// taking random input as int as r3 variable
                    int r4 = random.nextInt(6) + 1;// taking random input as int as r3 variable

                    int score1 = r3 + r4;// Adding the r3 and r4 and storing it score1 variable as int
                    if (score1 == point) { // if statement body begins
                        win++;// counting the winning count if the condtion satisfies
                        break;// break for exiting the loop
                    }
                    if (score1 == 7) {
                        lose++;// counting the losing count if the else if conditon satisfies
                        break;// break for exiting the loop
                    }
                } // while loop ends
            } // if else if ladder ends
        } // for loop ends
        System.out.println("You have Won:"+win+" "+" times");// displaying the no of winning counts
        System.out.println("You have lose:"+lose+" "+"times");// displaying the no losing counts

    }
}
