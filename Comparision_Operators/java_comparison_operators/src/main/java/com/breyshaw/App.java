package com.breyshaw;

public class App 
{
    public static void main( String[] args )
    {
        //We use these operators to compare two primitive values
        int x = 1;
        int y = 1;
        //Equality operator (not to be confused with the assignment operator). The following is a boolean expression
        System.out.println(x == y);
        System.out.println(x != y); //The expression x is not equal to y returns false
        System.out.println(x > y); // x is greater than y returns false
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
    }
}
