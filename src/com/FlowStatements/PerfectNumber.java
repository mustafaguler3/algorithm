package com.FlowStatements;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){

        int count =0;

        if(number<1){
            return false;
        }else{
            for(int i=1;i<number;i++){

                if(number%i==0){
                    count+=i;
                }
            }

            if(count==number){
                System.out.println("it is a perfect number");
            }else{
                System.out.println("it is not a perfect number");
            }
            return true;
        }


    }
}
