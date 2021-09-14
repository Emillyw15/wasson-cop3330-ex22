/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        System.out.print("Enter the third number: ");
        int third = in.nextInt();

        if (first == second || first == third || second == third) {
            System.exit(0);
        }
        else if (first > second && first > third) {
            System.out.println("The largest number is " + first);
        }
        else if (second > first && second > third) {
            System.out.println("The largest number is " + second);
        }
        else if (third > first && third > second) {
            System.out.println("The largest number is " + third);
        }
    }
}
