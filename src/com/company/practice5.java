package com.company;
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] values = new int[10];
        int sum = 0;
        // populating array with user input
        for(int i = 0; i < 10; i++ ) {
            System.out.println("Please enter value #" + (1+i) + ":");
            values[i] = keyboard.nextInt();
        }

        int counter = 0;

        for(int i = 0; i <values.length; i++) {
            if (values[i] % 2 == 0) {
                counter++;
            }
        }

        System.out.println("Number of even values:" + counter);
        System.out.println("Number of odd values:" + (values.length - counter) );
    }
}
