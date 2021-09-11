package com.FlowStatements;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reversedNum = 0;
        int lastDigit = 0;

        Integer num = Integer.valueOf(number);

        while(number != 0){
            lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }

        if(reversedNum == num) {
            System.out.println("It's a palindrome");
        } else

            System.out.println("Not a palindrome");
        return false;

    }
}
