package com.classes.inheritance;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        this(0,0);//calls 2nd constructor
    }

    public Rectangle(int width,int height){
        this(0,0,width,height);//calls 3rd constructor
    }
    public Rectangle(int x,int y,int width,int height){
        //initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
