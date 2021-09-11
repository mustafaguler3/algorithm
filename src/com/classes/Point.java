package com.classes;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        int dist = this.x - 0;
        return dist;
    }
    public double distance(int x,int y){
        double dist = Math.sqrt(y)-Math.sqrt(x);;

        return dist;
    }

    public double distance(Point point){
        double dist = 1;

        return dist;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }


}
