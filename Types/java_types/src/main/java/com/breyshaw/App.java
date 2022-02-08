package com.breyshaw;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {
//---------------------PRIMITIVE TYPES------------------
//Used to store simple values
        //integers use 4 bytes which is overkill for just this number. We can use 1 byte because it allows us to store values up to 127
        // int age = 27;
        byte age = 27;
        //When working with a big number we can use underscores to seperate digits to make it more readable
        int viewsCount = 123_456_789;
        //With int you can store values up to 2 billion, you'll get an error if the number is too large
        long bigNumber = 3_123_456_789L;
        //Java compiler sees the value above as an integer, hence the L at the end which specifies this variable is a long type
        //Use float for decimal numbers
        float price = 10.99F;
        //Have to use another suffix, F like with long types
        //Defines Characters
        char letter = 'A';
        //Boolean
        boolean isEligible = false;

//----------------REFERENCE TYPES--------------------
//Use to store complex objects

        System.out.println( "Hello World!" );
    }
}
