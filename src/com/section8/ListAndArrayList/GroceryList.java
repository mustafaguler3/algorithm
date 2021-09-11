package com.section8.ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() + " items in your grocery");

        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + ". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+" has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
        //Milk
        //Cheese
        //Bread
    }
    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}




