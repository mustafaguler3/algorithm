package com.classes.section7.polymorphism.challenges;

public class Mercedes extends Car{

    public Mercedes(){
        super(4,"Mercedes");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "car -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "car -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "car -> brake()";
    }
}
