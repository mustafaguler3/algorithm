package com.classes.section7.MasterChallenges;

public class main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"Black");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.14);
        price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",1200);
        healthyBurger.addHealthyAddition1("Egg",5.45);
        hamburger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Leta",7.1);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition3("Should not do this ",50.12);
    }


}
