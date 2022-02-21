package com.breyshaw;

public class App 
{
    public static void main( String[] args )
    {
        //COMPARISION OPERATORS
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

        //LOGICAL OPERATORS

        //AND Operator
        // int temperature = 22;
        // boolean isWarm = temperature > 20 && temperature < 30; //if both of these conditions are true, the result will be true, if either is false, so will the result
        // System.out.println(isWarm);

        //OR Operator
        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = true;
        // boolean isEligible = hasHighIncome || hasGoodCredit;
        // System.out.println(isEligible);

        //NOT operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

    }
}
