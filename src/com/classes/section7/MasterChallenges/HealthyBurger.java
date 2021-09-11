package com.classes.section7.MasterChallenges;

public class HealthyBurger extends Hamburger{

    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown eye");
    }

    public void addHealthyAddition1(String name,double price){
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtraName !=null){
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added "+this.healthyExtraName + " for an extra "+this.healthyExtraPrice);

        }
        if(this.healthyExtra2Name !=null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra2Name + " for an extra "+this.healthyExtra2Price);

        }

        return hamburgerPrice;
    }
}
