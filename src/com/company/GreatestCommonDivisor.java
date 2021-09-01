package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first,int second){

        int greatest = 0;

        if(first > 10 && second > 10){

            for(int i = 1; ((i <= first) && (i <=second)); i++ ){
                if((first % i == 0) && (second % i == 0)){
                    greatest = i;
                }
            }
            System.out.println(greatest);

            return 1;

        } else
            System.out.println("-1");
        return -1;
    }
}
