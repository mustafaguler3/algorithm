package com.section8.Arrays.challenges;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = readIntegers(5);

        findMin(myArray);

        System.out.println();
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];

        System.out.println("Enter number #");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        for (int i=0;i<array.length;i++){
            System.out.println("Elements "+i+" c "+array[i]);
        }

        return array;
    }

    public static void findMin(int[] array){
        int[] arrays = new int[array.length];
        int min = Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min = "+min);
    }
}
