package com.company;

public class practice4 {
    public static void main(String[] args) {
        int[] firstArray = {1, 7, 6, 5, 9};
        int[] secondArray = {2, 7, 6, 3, 4};

        for(int i = 0; i < firstArray.length; i++) {
            for(int k = 0; k < secondArray.length; k++) {
                    if ((firstArray[i]) + (secondArray[k]) == 13) {
                        System.out.println("(" + firstArray[i] + "," + secondArray[k] + ")");
                    }
            }
        }
    }
}
