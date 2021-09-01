package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;

    }
}
