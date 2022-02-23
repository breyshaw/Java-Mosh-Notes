package com.breyshaw;

public class App {
    public static void main(String[] args) {
        int income = 120_000;
        // String className = income > 100_000; This alone does not work because we are defining a string and boolean. This is where ternary operators come in.
        String className = income > 100_000 ? "First" : "Economy"; //This has three pieces, the condition, the value to return if the condition is true and then the value to return if the condition is false. 
        System.out.println(className);
    }
}
