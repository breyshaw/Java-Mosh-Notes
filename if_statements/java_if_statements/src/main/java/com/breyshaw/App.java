package com.breyshaw;

public class App {
    public static void main(String[] args) {

        int temp = 32; // declaring the variable

        if (temp > 30) { // if this if statement condition is true, the following code block will
                         // execute. This if statement has 3 clauses. Parent followed by two children.
            System.out.println("It's a hot day!");
            System.out.println("Drink water");
        } else if (temp > 20) { // braces are only required if you have more than one statement. Im going to add
                                // them anyway out of habit
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day!");
        }
    }
}
