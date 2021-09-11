package com.section8.ListAndArrayList.challenges2;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("05377048490");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();

        while (!quit){
            System.out.println("Enter a action\n");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 1:
                    printAction();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;

            }

        }

    }

    public static void startPhone(){
        System.out.println("Starting phone..");
    }

    public static void addNewContact(){
        System.out.println("Enter a name\n");
        String name = scanner.nextLine();
        System.out.println("Enter a phone number\n");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name,phoneNumber);

        mobilePhone.addNewContact(contact);
        System.out.println();

    }

    public static void updateContact(){
        System.out.println("Enter a name");
        String name = scanner.nextLine();
        Contact existingName = mobilePhone.queryContact(name);

        if(existingName == null){
            System.out.println("not found");
        }
        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        System.out.println("Enter new number");
        String newNumber = scanner.nextLine();
        Contact contact = new Contact(newName,newNumber);

        mobilePhone.updateContact(existingName,contact);
    }

    public static void printAction(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0-to shutdown\n"+
                "1-to print contacts\n"+
                "2-to add a new contact\n"+
                "3-to update existing an existing contact\n"+
                "4-to remove an existing contact\n"+
                "5-query if an existing contact exists\n"+
                "6-to print a list of available actions");
        System.out.println("Choose your action: ");
    }
}
