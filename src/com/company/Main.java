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


    public static void main(String[] args) {
        printArrayElements();
        printArrayOfZeroValues();
    }
}