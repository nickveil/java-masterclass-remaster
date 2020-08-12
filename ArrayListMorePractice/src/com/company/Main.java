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
                            "1  - to print Employee Roster\n" +
                            "2  - to add Employee\n"+
                            "3  - to update Employee\n"+
                            "4  - to remove employee\n"+
                            "5  - to search for an employee" +
                            "6  - to print instructions");
    }

    public static void  addEmployee(){
        System.out.print("Enter the employee name:");
        String employee = scanner.nextLine();
        System.out.print("Enter the employee location:");
        String location = scanner.nextLine();

        Employee newEmployee = Employee.createEmployee(employee,location);
        if (employeeRoster.addEmployee(newEmployee)){
            System.out.println("Employee: " + employee + " at location " + location + " has been added.");
        } else {
            System.out.println("Employee " + employee + " is already on file.");
        }

    }

    public static void updateEmployee(){
        System.out.println("Enter the employee name you wish to change:");
        String name = scanner.nextLine();
        Employee existingEmployee = employeeRoster.findEmployee(name);
        if (existingEmployee == null){
            System.out.println("Employee not found.");
            return;
        }
        System.out.print("Enter employee name update: " );
        String newName = scanner.nextLine();
        System.out.println("Enter employee location update: ");
        String newLocation = scanner.nextLine();

        Employee newEmployee = Employee.createEmployee(newName,newLocation);

        if (employeeRoster.updateEmployee(existingEmployee, newEmployee)){
            System.out.println("Employee update successful.");
        } else {
            System.out.println("Error updating employee.");
        }
    }

    public static void removeEmployee(){
        System.out.println("Enter the employee name you wish to remove:");
        String name = scanner.nextLine();
        Employee existingEmployee = employeeRoster.findEmployee(name);
        if (existingEmployee == null){
            System.out.println("Employee not found.");
            return;
        }

        if (employeeRoster.removeEmployee(existingEmployee)){
            System.out.println(name + " was successfully removed.");
        } else {
            System.out.println("Error. Employee not removed.");
        }
    }

    public static void findEmployee(){
        System.out.printf("Enter employee name to search: ");
        String name = scanner.nextLine();
        Employee existingEmployee = employeeRoster.findEmployee(name);
        if (existingEmployee == null){
            System.out.println("Cannot find employee " + name);
            return;
        }

        System.out.println("Employee " + existingEmployee.getName()+ " is located in the " + existingEmployee.getLocation() + " office.");
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