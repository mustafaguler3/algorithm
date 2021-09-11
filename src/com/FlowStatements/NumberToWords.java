package com.FlowStatements;

public class NumberToWords {
    public static void numberToWords(int number){

        int lastDigit = number % 10;

        if(number<0){
            System.out.println("Invalid Value");
        }

        switch (lastDigit){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("it is over nine");

        }

    }

    public static int reverse(int number){
        int remainder;
        int newNum = 0;

        while(number != 0) {
            remainder = number % 10;
            newNum += remainder;

            newNum *= 10;
            number /= 10;
        }

        newNum /= 10;
        System.out.println(newNum);
        return newNum;
    }

    public static int getDigitCount(int number){
        int count = 0;
        for(int i = number; i > 0; i /= 10){
            count++;
        }

        System.out.println(count);
        return count;
    }
}
