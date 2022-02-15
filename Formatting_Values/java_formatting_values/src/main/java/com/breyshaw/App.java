package com.breyshaw;
import java.text.NumberFormat;

public class App 
{
    public static void main( String[] args )
    {
        //Cannot use the new operator to create a new instance because it is abstract
        // NumberFormat currency = new NumberFormat();
        
        //Currency
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(1234567.891);
        // System.out.println(result);

        //Percent
        String result = NumberFormat.getPercentInstance().format(0.1); //Method chaining here allows us to convert it to a string so that it can be stored in the result variable
        System.out.println(result);
    }
}
