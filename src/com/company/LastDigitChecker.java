package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b,int c){
        int lstDigitA = a % 10;
        int lstDigitB = b % 10;
        int lstDigitC = c % 10;

        if(a>=0 && a<=1000 && b>=10 && b<=1000 && c>=10 && c<=1000) {

            if (lstDigitA == lstDigitB || lstDigitA == lstDigitC || lstDigitB == lstDigitC) {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
