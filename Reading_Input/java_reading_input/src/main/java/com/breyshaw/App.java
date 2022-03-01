package com.breyshaw;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //To work in the terminal window we use System.in
        Scanner scanner = new Scanner(System.in);

        //BYTES
        System.out.print("Age:");
        //There are a lot of methods for reading data using the scanner object, next lets you choose the next thing to read, boolean, byte, etc
        byte age = scanner.nextByte(); //nextByte returns a byte value so we can store it in a byte variable
        System.out.println("You are " + age + "years old.");

        //STRINGS
        //to read a string just use scanner.next()
        // System.out.print("Name:");
        // String name = scanner.next(); //next method only reads one token. if using my first and last name it will only come back brey.
        // String name = scanner.nextLine(); //nextLine method reads the entire line. Can chain the trim method here if I want to get rid of whitespace.
        // System.out.println("You are " + name); //concatinating a string with a byte, Java automatically converts the byte to a string. Implicit conversion.
    }
}
