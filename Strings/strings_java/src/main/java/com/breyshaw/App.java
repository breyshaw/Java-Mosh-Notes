package com.breyshaw;

/**
 * Hello world!
 *
 */
public class App 
{
    // public static void main( String[] args )
    // {
        //Shortcut to create a reference type string
        // String message = "Hello World" + "!!";
        //Technicially Hello world is a string literal here or a string value.
        //Now we can use built in methods on our message variable
        // System.out.println(message.endsWith("!!"));
        //Gives a boolean value, true
        // System.out.println(message.length());
        //Gives the length of the strings characters
        // System.out.println(message.indexOf("H"));
        //Gives the index number of a certain character
        // System.out.println(message.replace("!", "*"));
        //Replaces the characters, first parameter is the target, the second is the replacement character. Arguements are the actual values. 
        //Methods that modify a string, return a NEW string object
        // System.out.println(message);
//     }
// }

//Escape Sequences-------------------------------
public static void main( String[] args )
{
    //To put a strings word in quotes without breaking the string, use backslashes
    // String message = "Hello \"Brey\"";
    //Use double backslashes to print one backslash
    // String message = "c:\\Windows\\...";
    // Backslash N breaks the line
    // String message = "c:\nWindows\\...";
    String message = "c:\tWindows\\...";
    //Backslash T tabs the printed string at that location
    System.out.println(message);
}
}
