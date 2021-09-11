package com.classes.section7.composition.challenge;

public class main {
    public static void main(String[] args) {
        Wall wall = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,40);
        Bed bed = new Bed("Modern",4,5,6,2);
        Lamp lamp = new Lamp("Classic",false,78);
    }
}
