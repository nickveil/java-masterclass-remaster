package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> mobilePhone = new ArrayList<String>();

    public void printContactList (){
        System.out.println("You have " + mobilePhone.size() + " contacts.");
        for (int i=0; i <mobilePhone.size(); i++){
            System.out.println((i+1) + ". " + mobilePhone.get(i));
        }
    }

    public void addNewContact (String contact){
        mobilePhone.add(contact);

    }

    public void updateContact (int number, String newContact){
        mobilePhone.set(number,newContact);
        System.out.println("Contact number " + (number+1) + " has been updated to: " + newContact );
    }

    public void removeContact (int number){
        int numberCache = number+1;
        mobilePhone.remove(number);
        System.out.println("Contact number " + numberCache + " has been removed");

    }

    public boolean onFile (int number){
        int numberCache = number-1;
       if (mobilePhone.indexOf(numberCache)>=0){
           return true;
       }
       return false;
    }

}
