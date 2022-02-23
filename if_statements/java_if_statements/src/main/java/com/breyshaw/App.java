package com.breyshaw;

public class App {
    public static void main(String[] args) {

        int temp = 35; // declaring the variable

        if (temp > 30) { // if this if statement condition is true, the following code block will
                         // execute. This if statement has 3 clauses. Parent followed by two children.
            System.out.println("It's a hot day!");
            System.out.println("Drink water");
        } else if (temp > 20) { // braces are only required if you have more than one statement. Im going to add
                                // them anyway out of habit
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day!");
        
        //Simplifying if statements -------------------------------------

        int income = 50_000; //the underscore just makes the code more readable
        // boolean hasHighIncome = false;//giving the variable an initial value. Makes it to where we don't need the else clause
        // if (income > 100_000) { //variables can only be defined within a code block. Brackets required here if it is one statement.
        //     hasHighIncome = true; //this is only available within this code block. So we declare the hasHighIncome variable before the if statement like on line 21
        // }
        boolean hasHighIncome = (income > 100_000); //all the code above can be reduced to this one line
        System.out.println(hasHighIncome);
        }
    }}

