package com.classes.section7;

import com.classes.section7.composition.*;

public class main {
    public static void main(String[] args) {

        Dimensions dimension = new Dimensions(200,300,150);
        Case theCase = new Case("220B","Intel","240",dimension);

        Monitor monitor = new Monitor("Samsung","Samsung",28,new Resolution(1920,1080));

        Motherboard motherboard = new Motherboard("LJX","Asus",4,4,"v2.60");

        Computer computer = new Computer(theCase,motherboard,monitor);

        computer.powerUp();

    }

}
