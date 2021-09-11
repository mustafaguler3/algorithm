package com.classes;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }

    public Wall(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        int area = (int)Math.floor(width*height);
        if(width <0 || height <0){
            area = 0;
        }

        return area;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }
}
