package com.section8.ListAndArrayList.challenges2;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        boolean exist = myContacts.contains(contact);
        if(exist){
            System.out.println(contact.getName()+" is available");
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for (int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);

            if(contact.getName().equals(contactName)){
                return i;
            }
        }

        return -1;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact);

        if(position>=0){
            this.myContacts.set(position,newContact);
            System.out.println("it was successfully updated");
            return true;
        }else{

            return false;
        }

    }

    public boolean removeContact(Contact contact){
        int pos = findContact(contact);

        if(pos>=0){
            this.myContacts.remove(pos);
            System.out.println("Contact was successfully deleted.");
            return true;
        }else{
            return false;
        }

    }

    public void printContacts(){
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+ "Name : "+this.myContacts.get(i).getName()
            +" Phone number "+myContacts.get(i).getPhoneNumber());
        }
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos>=0){
            return myContacts.get(pos);
        }
        return null;
    }
}
