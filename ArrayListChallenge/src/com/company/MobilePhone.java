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

    public void updateContact (String contact, String newContact){
        int contactNumber = findContact(contact);
        mobilePhone.set(contactNumber,newContact);
        System.out.println("Contact " + contact + " has been updated to: " + newContact );
    }

    public void removeContact (String contact){
        mobilePhone.remove(contact);
        System.out.println("Contact " + contact + " has been removed");

    }

    private int findContact (String searchContact){
        return mobilePhone.indexOf(searchContact);
    }

    public boolean onFile (int number){
        int numberCache = number-1;
       if (mobilePhone.indexOf(numberCache)>=0){
           return true;
       }
       return false;
    }

}
