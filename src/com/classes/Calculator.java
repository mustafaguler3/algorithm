package com.classes;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double totalCost = carpet.getCost()*(floor.getArea());

        return totalCost;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }
}
