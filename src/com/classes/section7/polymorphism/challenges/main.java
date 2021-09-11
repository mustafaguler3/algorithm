package com.classes.section7.polymorphism.challenges;

public class main {
    public static void main(String[] args) {
        Mitsubishi mitsubishi = new Mitsubishi(4,"Myis");
        mitsubishi.accelerate();
        mitsubishi.brake();

        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());
        System.out.println(mercedes.getName());
    }
}
