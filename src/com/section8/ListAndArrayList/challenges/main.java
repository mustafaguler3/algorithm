package com.section8.ListAndArrayList.challenges;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("05377048490");
    public static void main(String[] args) {


        boolean quit = false;
        startPhone();
        printActions();

        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    //printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
            }
        }
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact contact = Contact.createContact(name,phone);

        if (mobilePhone.addNewContact(contact)){
            System.out.println("new contact added : name .= "+name+", phone = "+phone);
        }else {
            System.out.println("cannot add, "+name+" already on file");
        }
    }
    public static void updateContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating recording");
        }

    }

    public static void removeContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("error deleting contact");
        }
    }

    public static void queryContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name :"+existingContact.getName()+" phone number"+existingContact.getPhoneNumber());
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("error deleting contact");
        }
    }

    public static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0-to shutdow\n"+
                "1-to print contacts\n"+
                        "2-to add a new contact\n"+
                "3-to update existing an existing contact\n"+
                "4-to remove an existing contact\n"+
                "5-query if an existing contact exists\n"+
                "6-to print a list of available actions");
        System.out.println("Choose your action: ");
    }
}











