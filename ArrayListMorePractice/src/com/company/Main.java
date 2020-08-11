package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeRoster employeeRoster = new EmployeeRoster("Lincoln");

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {
            System.out.println("Enter Action: (6 to show options)");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Employee roster.");
                    quit = true;
                    break;
                case 1:
                    employeeRoster.printEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    findEmployee();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    public static void printActions(){
        System.out.println("Select from the following option:");
        System.out.println( "0  - to exit Employee Roster\n" +
                            "1  - ");
    }
}

// writing another program with ArrayLists for better understanding
// Create another program that implements a simple office location book with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Employees (name and phone number).
// Create a master class (EmployeeRoster) that holds the ArrayList of Employees
// The EmployeeRoster class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of employees, add new employee, update existing employee, remove employee
// and search/find employee.
// When adding or updating be sure to check if the employee already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to EmployeeRoster
// e.g. no ints, no .get(i) etc
// EmployeeRoster should do everything with Employees objects only.