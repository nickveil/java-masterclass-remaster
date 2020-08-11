package com.company;

public class Employee {
    private String name;
    private String location;

    public Employee(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public static Employee createEmployee(String name, String location){
        return new Employee(name, location);
    }
}
