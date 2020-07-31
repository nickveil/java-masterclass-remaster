package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private  int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine(){
        return "Car.startEngine() called";
    }

    public String accelerate(){
        return "Car.accelerate() called";
    }

    public String brake(){
        return "Car.brake() called";
    }
}

class Dodge extends Car{
    public Dodge(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Dodge.startEngine() called";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String accelerate() {
        return "Ford.accelerate() called";
    }
}

class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String brake() {
        return "Toyota.break() called";
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ;i++) {
            Car car = pickCar(i);
            System.out.println("Car name: " + car.getName() + "\n" +
                    "Start function: " + car.startEngine() + "\n" +
                    "Accelerate function: " + car.accelerate() + "\n" +
                    "Break function: " + car.brake() + "\n");
        }
    }

    public static Car pickCar(int number){
        switch (number){
            case 1:
                return new Dodge("Ram",8);
            case 2:
                return new Ford("Focus", 4);
            case 3:
                return new Toyota("Rav4", 6);
            default:
                return new Car("Unknown",-1);
        }
    }
}


