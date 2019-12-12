package com.company;

public class Main {

    //First problem
    public static void printArrayElements() {
        int[] arr = {1, 5, 6, 12, 68, 25, 78};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        printArrayElements();
    }
}