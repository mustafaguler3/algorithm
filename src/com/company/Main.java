package com.company;
import com.classes.inheritance.challenge.Cylinder.Circle;
import com.classes.inheritance.challenge.PooArea.Rectangle;

import java.util.Scanner;

class Dogy{

    private String name;

    public Dogy(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("name ="+name);
    }
}

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius ="+circle.getRadius());
        System.out.println("circle.area ="+circle.getArea());
        System.out.println("********************************");

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("width ="+rectangle.getWidth());
        System.out.println("length ="+rectangle.getLength());
        System.out.println("area ="+rectangle.getArea());

//        Outlander outlander = new Outlander(36);
//        outlander.accelerate(30);
//        outlander.accelerate(20);


//        //Dogy dogy = new Dogy();//create instance
//        //dogy.bark(); //call instance method
//
//        Dog dog = new Dog("oki",8,25,2,4,1,10,"longer");
//        Fish fish = new Fish("koli",4,50,50,10,2);
//
//        fish.eat();
//        fish.swim(400);
//
//        dog.eat();
//        dog.walk();
//        dog.run();

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75,4.0);
//        Calculator calculator = new Calculator(floor,carpet);
//
//        System.out.println("total ="+calculator.getTotalCost());
//
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor,carpet);
//
//        System.out.println("total ="+calculator.getTotalCost());

//        Wall wall = new Wall(5,4);
//        System.out.println("area = "+wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width =" +wall.getWidth());
//        System.out.println("height ="+wall.getHeight());
//        System.out.println("area ="+wall.getArea());
//
//        Wall wall1 = new Wall(-1.25,-1.25);
//        System.out.println(wall1.getArea());

//        VipCustomer customer = new VipCustomer();
//        System.out.println(customer.getName());
//        System.out.println(customer.getCreditLimit());
//
//        System.out.println("*************************************");
//
//        VipCustomer customer1 = new VipCustomer("mustafa","555");
//        System.out.println(customer1.getName());
//        System.out.println(customer1.getCreditLimit());
//
//        BankAccount account = new BankAccount();
////        account.setAccountNumber("123456");
////        account.setBalance(5000);
////        account.setCustomerName("Mustafa Güler");
////        account.setEmail("mustafa.glr@hotmail.com");
////        account.setPhoneNumber("05377048490");
//
//        account.withdraw(1000);
//        account.deposit(500);
//
//
////        Person person = new Person();
////        person.setFirstName("mustafa");
////        person.setLastName("güler");
////        person.setAge(-5);
////
////        System.out.println(person.getFullName());
////        System.out.println(person.getAge());
////        System.out.println(person.isTeen());
//
//        //minAndMax();
//        //InputCalculator.inputThenPrintSumAndAverage();
//        //readUserInput();


    }

    private static void minAndMax() {
        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        int max = 0;
        int min = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else{
                break;
            }

        }
        System.out.println("Max = "+max+" Min = "+min);
        scanner.close();
    }

    private static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number #"+order+" :");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter==10){
                    break;
                }
            }else{
                System.out.println("Invalid Value");
            }
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
