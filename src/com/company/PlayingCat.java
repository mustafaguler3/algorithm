package com.company;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temperature){

        if(temperature>=25 && temperature<=35){
            summer = true;
            System.out.println("The cat is playing "+true);
        }else if(temperature>36 && temperature<=45){
            summer = true;
            System.out.println(true);
        }else{
            summer = false;
            System.out.println(false);
        }
        return summer;
    }
}
