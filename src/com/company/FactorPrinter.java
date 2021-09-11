package com.company;

public class FactorPrinter {
    public static void printFactors(int number){
        int count = 0;

        if(number<1){
            System.out.println("Invalid Value");
        }else{

            for (int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                    System.out.println("numbers = "+i);
                }
            }
            System.out.println("Count = "+count);
        }
    }
}
