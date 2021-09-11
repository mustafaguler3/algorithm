package com.section8.Arrays.challenges;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {4,5,2,1,3,6};

        System.out.println("array ="+ Arrays.toString(array));
        reverse(array);
        System.out.println("reversed array = "+Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int max = array.length-1;
        int half = array.length/2;
        for(int i=0;i<half;i++){
            int temp = array[i];
            array[i] = array[max-i];
            array[max-i] = temp;
        }
    }
}
