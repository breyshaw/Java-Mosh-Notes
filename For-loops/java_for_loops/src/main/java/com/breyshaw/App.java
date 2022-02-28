package com.breyshaw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //FOR LOOPS -------------------------- (cleaner, used when you know how many times you want to execute the statement )

        // declare a loop or counter variable int i ; then how many times the loop is executed i < 5; i++ (i is incremented by one which starts the loop over)
        for (int i = 0; i < 5; i++) { //i can start at a different int, i can also be decremented
            System.out.println("Hello world!" + i);
        }
        //WHILE LOOPS ----------------------------- (best used when you do not know the amount of times the statement should be executed)
            int i = 0;
            while (i > 0) {
                System.out.println("Hello world!" + i);
                i--; //At the end of each iteration, we are decrementing i
            }
            //Example-------------------------------(as long as the input does not equal "quit", we are going to ask a user to enter something)
            Scanner scanner = new Scanner(System.in); //if this is within the loop it will make a lot of scanner objects (polluting memory)
            String input = "";
            while (!input.equals("quit")) { //cannot use comparision operators between reference types it will compare the value of the strings address not the value
                System.out.print("Input: ");
                input = scanner.next().toLowerCase();
                if (input.equals("pass"))
                    continue; //when java sees this, it moves back to the beginning of the statement
                if (input.equals("quit"))
                    break; //when java sees this statement it will ignore everything after and terminate the loop. Use this with while(true) to avoid infinite loops
                System.out.println(input);
            }

        //DO.... WHILE LOOPS (gets executed at least once), checks condition last
            // do {
            //     System.out.println("Input: ");
            //     input = scanner.next().toLowerCase();
            //     System.out.println(input);
            // } while (!input.equals("quit"));
        }
    }
