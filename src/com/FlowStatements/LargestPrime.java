package com.FlowStatements;

public class LargestPrime {
    public static int getLargestPrime(int number){

        int greatest = 0;

        if(number<0){
            return -1;
        }else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    greatest = i;
                }

            }
            System.out.println("Greatest prime number is "+greatest);
        }
        return greatest;
    }
}
