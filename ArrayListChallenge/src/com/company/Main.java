package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit){
            System.out.println("Please make your selection. Enter 0 for help with choices.");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - For Help.");
        System.out.println("\t 1 - To print the entire contact list.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addContact(){
        System.out.print("Please enter your contact's name: ");
        String contactName = scanner.nextLine();
        mobilePhone.addNewContact(contactName);
    }

    public static void updateContact(){
        mobilePhone.printContactList();
        System.out.println("Please select the number of the contact to update: ");
        int contactNumber = scanner.nextInt();
        System.out.println("Please enter replacement name: ");
        mobilePhone.updateContact(contactNumber,scanner.nextLine());

        System.out.println("Your contact list has been updated:");
        mobilePhone.printContactList();

    }
    public static void removeContact(){
        mobilePhone.printContactList();
        System.out.println("Please enter the number of the contact you wish to remove: ");
        int contactNumber = scanner.nextInt();
        if (mobilePhone.onFile(contactNumber)) {
            mobilePhone.removeContact(scanner.nextInt());
            System.out.println("The contact selected has been removed.");
            mobilePhone.printContactList();
        }else {
            System.out.println("Sorry, that contact number is not in the list.");
        }

    }
}
