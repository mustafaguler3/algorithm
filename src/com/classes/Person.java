package com.classes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() || lastName.isEmpty()){
            return "empty String";
        }else if(lastName == ""){
            return firstName;
        }else if(firstName == ""){
            return lastName;
        }else{
            return firstName + lastName;
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String  getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age<=0 || age<=100){
            age = 0;
        }
        this.age = age;
    }

}
