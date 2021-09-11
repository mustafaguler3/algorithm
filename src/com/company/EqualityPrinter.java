package com.company;

public class EqualityPrinter {
    public static void printEqual(int a,int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }else if(a==b && a==c){
            System.out.println("All numbers are equal");
        }else if(a==b && a!=c){
            System.out.println("Neither All numbers are equal or different");
        }else{
            System.out.println("All numbers are different");
        }
    }
}
