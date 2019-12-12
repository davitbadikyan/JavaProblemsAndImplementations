package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    //First problem
    public static void printArrayElements() {
        int[] arr = {1, 5, 6, 12, 68, 25, 78};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Second Problem
    public static void printArrayOfZeroValues() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Third Problem
    public static void printArrayElementsToThousand() {
        int[] arr = new int[1001];
        int value = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = value;
            value++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Forth Problem
    public static void printEvenElements() {
        byte[] arr = new byte[31];
        int index = 0;
        for (byte i = -30; i <= 30; i += 2) {
            if (i != 0) {
                arr[index] = i;
                System.out.print(arr[index] + " ");
                index++;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printArrayElements();
        printArrayOfZeroValues();
        printArrayElementsToThousand();
        printEvenElements();
    }
}