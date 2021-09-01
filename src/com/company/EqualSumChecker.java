package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int first,int second,int third){

        if((first + second) == third){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }

    }
}
