package com.FlowStatements;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){

        int sum = 0;

        if(number<0){
            return -1;
        }else{
            while (number != 0){
                int lastDigit = number % 10;

                if(lastDigit % 2 == 0){
                    sum += lastDigit;
                    //System.out.println("sum of even digit = "+sum);
                }
                number /=10;
            }
            System.out.println("sum of even digit = "+sum);
            return 1;
        }
    }
}
