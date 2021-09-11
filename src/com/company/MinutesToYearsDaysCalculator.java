package com.company;

public class MinutesToYearsDaysCalculator {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long minutesInYear = 60 * 24 * 365;
            long years = minutes / minutesInYear;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;
            System.out.println(minutes+"min= "+years+"y"+daysRemaining+"d");
        }
    }
}
