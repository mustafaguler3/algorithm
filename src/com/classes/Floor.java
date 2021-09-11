package com.classes;

public class Floor {

    private double width;
    private double lenght;

    public Floor() {

    }

    public Floor(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getArea(){
        int area = (int)(width * lenght);

        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            width = 0;
        }
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if(lenght<0){
            lenght = 0;
        }
        this.lenght = lenght;
    }
}
