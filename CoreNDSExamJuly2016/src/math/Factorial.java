package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        int y = 1;
        int i = x;

        while (i >= 1) {

            y *= i;
            i--;
        }
        System.out.println("Factorial is " + y);
    }
}


