package com.breyshaw;

public class App 
{
    public static void main( String[] args )
    {
        //2 bytes in short
        // short x = 1;
        // 4 bytes in short
        // int y = x + 2;
        // System.out.println( y );
        //When the code is executed, Java allocates a new anonymous variable, copys the value of x into that memory space and then adds the numbers together.
        // byte > short > int > long > float > double
        //This is called impilicit casting, conversion happens implicity or automatically, short and int are two different types
        //In the case below, we are dealing with a double and an integer, 
        // double x = 1.1;
        // double y = x + 2;// Java will automatically cast this integer as 2.0
        // int y =(int)x + 2; //This is explicit casting, specifically converts 1.1 to 1 in this case
        // System.out.println(y);
        //Explcit casting can only happen with compatible types
        String x = "1"; //Cannot case x to an integer
        int y = Integer.parseInt(x) + 2; //This method takes a string and returns and integer. Can do the same with double, float, etc.
        System.out.println(y);
    }
}
