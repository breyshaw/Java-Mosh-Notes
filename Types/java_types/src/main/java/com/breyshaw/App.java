package com.breyshaw;

import java.util.Date;

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
//Reference types deal with allocating memory
//VS Code will automatically import a package needed when tabbed on
//Packages create a namespace for classes. We can have the same class names in different packages. Using the Date java.util here
//The new operator allocates memory. Memory doesn't have to be allocated for primitive types
        Date now = new Date();
        //now is the variable name
        //The variable above is an instance of the Date() class. The class is like a blueprint. The instance itself is an object.
        now.getTime();
        //classes & objects have methods that we can access using the dot operator like on line 43. Reference types only
        System.out.println(now);
    }
}

//In Primitive types, when we declare a variable like "byte", the value assigned to the variable will be stored in that memory location
//In Reference types, the variable holds the address of the object in memory, not the actual object
