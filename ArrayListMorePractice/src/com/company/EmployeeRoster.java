package com.company;

import java.util.ArrayList;

public class EmployeeRoster {
    private String myLocation;
    private ArrayList<Employee> myEmployee;

    public EmployeeRoster(String myLocation) {
        this.myLocation = myLocation;
        this.myEmployee = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee){
        if( queryEmployee(employee.getName()) >= 0){
            System.out.println("Employee " + employee + " is already on the roster.");
            return false;
        }
        myEmployee.add(employee);
        return true;
    }

    public boolean updateEmployee(Employee oldEmployee, Employee newEmployee){
        int oldEmployeePosition = queryEmployee(oldEmployee);
        if(oldEmployeePosition <0){
            System.out.println(oldEmployee.getName() + " was not found.");
            return false;
        } else if (queryEmployee(newEmployee.getName()) != -1){
            System.out.println("Employee " + newEmployee.getName() + "is already on the roster");
            return false;
        }

        this.myEmployee.set(oldEmployeePosition, newEmployee);
        System.out.println(oldEmployee.getName() + " was replaced with " + newEmployee.getName());
        return true;
    }

    public boolean removeEmployee(Employee employee){
        int employeePosition = queryEmployee(employee);
        if(employeePosition <0){
            System.out.println(employee.getName() + " was not found.");
            return false;
        }
        this.myEmployee.remove(employeePosition);
        System.out.println(employee.getName() + " was removed from the roster.");
        return true;
    }
    private int queryEmployee ( Employee employee){
        return this.myEmployee.indexOf(employee);
    }
    private int queryEmployee (String name){
        for(int i=0; i<this.myEmployee.size(); i++){
            Employee employee = this.myEmployee.get(i);
            if (employee.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Employee findEmployee(String employee){
        int position = queryEmployee(employee);
        if (position >= 0){
            return this.myEmployee.get(position);
        }
        return null;
    }

    public void printEmployees (){
        System.out.println("You have " + this.myEmployee.size() + " employees of record.");

        for (int i =0; i<this.myEmployee.size(); i++){
            System.out.println((i + 1) + ". " +
                    this.myEmployee.get(i).getName() + " => " +
                    this.myEmployee.get(i).getLocation());
        }
    }
}
