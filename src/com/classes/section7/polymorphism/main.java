package com.classes.section7.polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independent Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet ";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
public class main {
    public static void main(String[] args) {

        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+":"+ movie.getName()+"\n"+"Plot: "+movie.plot()+"\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated was :"+randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
        }

        return randomMovie();
    }

}
