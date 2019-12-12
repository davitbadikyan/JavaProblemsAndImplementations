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

    // Fifth Problem
    public static void printOddElementsOfArray() {
        short[] arr= new short[151];
        int index = 0;
        for (short i = 1; i < 300; i += 2) {
            arr[index] = i;
            System.out.print(arr[index] + " ");
            index++;
        }
        System.out.println();
    }

    //Sixth Problem
    public static void arrayElementsCanBeDividedByFive() {
        int x = 5;
        int[] arr = {19, 65, -47, 34, 10, 35, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % x == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //Seventh Problem
    public static void doubleElementsGreaterThan() {
        double x = 24.56;
        double[] arr = {16.35, 58.1, 37.6, 24.6, -14.8, 21.1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //Eighth Problem
    public static void printElementsGreaterOrSmallerThan() {
        float[] arr = {3.4F, 14.8F, -61.7F, 2.1F, -39.4F, 356.8F};
        float a = 35.56F;
        float b = -34.655F;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a || arr[i] < b) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //Ninth Problem
    public static void sortArrayAscendingAndDescendingOrder() {
        double[] arr = {16.35, 58.1, 37.6, 24.6, -14.8, 21.1};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double result1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = result1;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double result2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = result2;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Tenth Problem
    public static void printALetters() {
        String str = "How to make Armenia strong again";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                result++;
            }
        }
        System.out.println(result);
    }

    //Eleventh Problem
    public static void checkingValueYesOrNo() {
        String str = "Something Someone Somebody";
        if (str.indexOf("b") != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        printArrayElements();
        printArrayOfZeroValues();
        printArrayElementsToThousand();
        printEvenElements();
        printOddElementsOfArray();
        arrayElementsCanBeDividedByFive();
        doubleElementsGreaterThan();
        printElementsGreaterOrSmallerThan();
        sortArrayAscendingAndDescendingOrder();
        printALetters();
        checkingValueYesOrNo();
    }
}