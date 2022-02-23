package com.breyshaw;

//We use switch statements to execute different parts of code depending on the value of an expression. Similar to if statements.
public class App {
    public static void main(String[] args) {
        String role = "admin"; //can use different data types here

        switch (role) {
            case "admin":
            System.out.println("You're an admin");
            break; //use the break to jump out of this switch block
            case "moderator":
            System.out.println("You're a moderator");
            break;
            default:
            System.out.println("You're a guest"); // do not need a break statement
        }

        //THE CODE BELOW IS THE SAME BUT WRITTEN AS AN IF STATEMENT
        if (role == "admin") {
            System.out.println("You're an admin");
        } else if (role == "moderator") {
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        }

    }
}
