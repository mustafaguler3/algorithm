package com.FlowStatements;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){

        int i = 0;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        while (i < bigCount && goal - 5 >= 0) {
            goal -= 5;
            i++;
        }

        return smallCount >= goal;

    }
}
