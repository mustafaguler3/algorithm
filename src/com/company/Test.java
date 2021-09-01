package com.company;

public class Test {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes,int seconds){
        if(minutes < 0 && seconds < 0 && seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        return hours + "h "+ remainingMinutes+"m"+ seconds+"s";
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid Value");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,seconds);
    }

}
