package com.FlowStatements;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int average = 0;


        while (true){
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else if(counter == 0){
                System.out.println("SUM = 0 and AVG = 0");
                break;
            }else{
                average = sum/counter;
                System.out.println("Sum = "+sum+ " Average = "+average);
                break;
            }
            scanner.nextLine();


        }
        scanner.close();
    }
}
