package com.breyshaw;

import java.util.Arrays;

public class App 
{
    // public static void main( String[] args )
    // {
        //Arrays are reference types, require the new operator
        //5 is the amount of numbers in the array
        // int[] numbers = new int[5];
        //Here we are setting the index of the array to a number value
        // numbers[0] = 1;
        // numbers[1] = 2;
        //This gives the memory allocation number
        // System.out.println(numbers);
        //need to use the toString method in the Arrays class
        // System.out.println(Arrays.toString(numbers));
    // }

    //Newer syntax to initialize an array if you know what is already in it
    //     public static void main( String[] args )
    // {
    //     int[] numbers = {2,3,5,1,4};
    //     Arrays.sort(numbers);
    //     System.out.println(Arrays.toString(numbers));
    // }

    //MULTI DIMENSIONAL ARRAYS-------------------------------------
    //2d arrays are used to store a matrix, 3d are used to store data of a cube
            public static void main( String[] args )
    {
        //Two rows, three columns
        //2d
        // int[][] numbers = new int[2][3];
        // numbers[0][0] = 1;
        //3D
        int [][] numbers = {{1,2,3},{4,5,6} };
        //use deepToString to print multi dimensional arrays
        System.out.println(Arrays.deepToString(numbers));
    }
}
