package Assignment01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution01 {
    /*
    print "What is your name?"
    'name' = read str from user
    'message' = "Hello, "+'name'+", nice to meet you!"
    print 'message'
     */
    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        String message = "Hello, "+name+", nice to meet you!";

        System.out.println(message);
    }
}
