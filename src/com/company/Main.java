package com.company;

public class Main {

    public static void main(String[] args) {
	String [] words = new String[] {"Wilson", "Ellie", "Laurence", "Colleen", "Oprah", "Melvin", "Auntie"};
        for(int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
