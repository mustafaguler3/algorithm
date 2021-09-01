package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1,int num2){
        if(num1>=10 && num1<=99 || num2>=10 && num2<=99){
            while (num1 != 0){
                int lastDigitNumberOne = num1 % 10;
                num1/=10;

                while (num2 != 0){
                    int lastDigitNumberTwo = num2 % 10;
                    num2/=10;

                    if(lastDigitNumberOne == lastDigitNumberTwo){
                        System.out.println(true);
                        return true;
                    }
                }
            }
        }
        System.out.println(false);
        return false;
    }
}
