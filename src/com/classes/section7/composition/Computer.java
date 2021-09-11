package com.classes.section7.composition;

public class Computer {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Computer(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200,1300,"blue");
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
