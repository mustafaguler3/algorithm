package com.company;

public class LeapYear {


    public static boolean isLeapYear(int year){

        if(year >= 1 || year <= 9999){
            return true;
        }else {
            if(year % 4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("The year is a leap year(it has 366 days)");
                        return true;
                    }
                }
            }else{
                System.out.println("That's not leap year");
                return false;
            }
        }
        return true;
    }
}
