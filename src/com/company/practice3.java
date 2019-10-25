package com.company;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] values = new int[10];

        // populating array with user input
        for(int i = 0; i < 10; i++ ) {
            System.out.println("Please enter value #" + (1+i) + ":");
            values[i] = key.nextInt();
        }

        // taking populated array and comparing them to eachother
        // nested for-loop is how it compares all
        // if (k != w) || (regarding index)
        // this is to check so you dont accidentally delete everything
        // (when it compares the same value to itself)
        for(int k = 0; k < values.length; k++) {
            for(int w = 0; w < values.length; w++) {
                if (k != w) {
                    if (values[k] == values[w]) {
                       values[k] = 0;
                       values[w] = 0;
                    }
                }
            }
        }

        // for enhanced/for each
        // printing all non-zero values (essentially deleting any doubles)
        for(int sad : values) {
            if (sad != 0) {
                System.out.println(sad);
            }
        }
    }
}
