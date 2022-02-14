package com.breyshaw;

public class App 
{
    public static void main( String[] args )
    {
        //Java Math class methods

        //Round - rounds a floating point number to a whole number
        // int result = Math.round(1.1F);

        //Ceiling - returns the smallest integer that is greater than or equal to the number
        // int result = (int)Math.ceil(1.1F); //Have to explicitly cast this result as an integer

        //Floor - method returns the largest integer that is smaller or equal to the number, also have to explicity cast the result as an integer
        // int result = (int)Math.floor(1.1F);

        //Max - method returns the greater of two values, the "min" method does the opposite but syntax is basically the same
        // int result = Math.max(1,2);

        //Random - for generating a random floating point number between 0 & 1
        // double result = Math.random();
        // 0 - 100
        // double result = Math.random() * 100;
        //To get rid of the decimal numbers we can round it or cast it to an integer
        // double result = Math.round(Math.random() * 100);
        //Can use explicit casting to store it as an integer this removes the decimal completely
        int result = (int) Math.round(Math.random() * 100);
        System.out.println( result );
    }
}
