package com.FlowStatements;

public class NumberInWord {
    public static void printNumberInWord(int number){

        if(number==0){
            System.out.println("zero");
        }else if(number==1){
            System.out.println("one");
        }else if(number==2){
            System.out.println("two");
        }else if(number==3){
            System.out.println("third");
        }else if(number==4){
            System.out.println("four");
        }else if(number==5){
            System.out.println("five");
        }else if(number==6){
            System.out.println("six");
        }else if(number==7){
            System.out.println("seven");
        }else if(number==8){
            System.out.println("eight");
        }else if(number==9){
            System.out.println("nine");
        }else {
            System.out.println("other");
        }

    }

    public static void printNumberInWordS(int number){
        switch (number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
        }
    }
}
