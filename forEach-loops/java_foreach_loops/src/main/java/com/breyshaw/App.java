package com.breyshaw;

public class App 
{
    public static void main( String[] args )
    {
        String[] fruits = {"Apple","Mango","Orange"};
        //delcare loop counter, as long as i = the length of fruits, execute and move on
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        //FOR EACH------------------------------
        //iterating over an array using a for Each loop. Forward only, cannot not execute from end to beginning (can do this with a regular for loop)
        for (String fruit : fruits)
        System.out.println(fruit);
        }
    }
}
