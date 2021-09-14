package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("What is the input string? ");
        String InputString;
        Scanner input=new Scanner(System.in);
        InputString=input.next();
        System.out.println((InputString) + " has " + (InputString.length()) + " characters.");
    }
}
