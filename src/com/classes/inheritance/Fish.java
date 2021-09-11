package com.classes.inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight,int gills,int eyes,int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveBackFin(){
        System.out.println("moveBackFin.called");
    }

    @Override
    public void eat(){
        System.out.println("Fish.eat() called");
    }

    public void swim(int speed){
        moveBackFin();
        super.move(speed);
    }
}
