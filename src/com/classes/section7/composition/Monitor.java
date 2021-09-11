package com.classes.section7.composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResoulution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResoulution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResoulution = nativeResoulution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at "+x+","+y+" in colour "+color);
    }
}
