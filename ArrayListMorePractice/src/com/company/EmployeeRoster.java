package com.company;

import java.util.ArrayList;

public class EmployeeRoster {
    private String myLocation;
    private ArrayList<Employee> myEmployee;

    public EmployeeRoster(String myLocation) {
        this.myLocation = myLocation;
        this.myEmployee = new ArrayList<Employee>();
    }

    public boolean addEmployee(){
        // addEmployee stuff here
        return true;
    }

    public boolean updateEmployee(){
        // updateEmployee stuff here
        return true;
    }

    public boolean removeEmployee(){
        // removeEmployee stuff here
        return true;
    }

    public Employee findEmployee(int employee){
        // need 2 methods to return employee number based on name and position
        return this.myEmployee.get(employee);
    }

    public void printEmployees (){
        System.out.println("You have " + this.myEmployee.size() + " employees of record.");

        for (int i =0; i<this.myEmployee.size(); i++){
            System.out.println((i + 1) + ". " + this.myEmployee.get(i).getName() + " => " + this.myEmployee.get(i).getLocation());
        }
    }
}
