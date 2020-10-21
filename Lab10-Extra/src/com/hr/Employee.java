package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    public void goToWork() throws DestinationUnreachableException{
        // TODO: create an instance of Car with all three properties: vin, make, model
        Car c = new Car("A123", "Toyota", "Prius");
        /*
         * I can always "punt" when calling an exception-prone method
         * This means I *DO NOT* try/catch that call
         * So then what happens when the exception is thrown back at me?
         */
        c.moveTo("West Seattle");
        System.out.println("Arrived at work");

        // TODO: call moveTo() on the Car object, passing "West Seattle" for the destination
//        try {
//            c.moveTo("West Seattle");
//            System.out.println("Arrived at work");
//        }
//        catch (DestinationUnreachableException e) {
//            //e.printStackTrace();
//            System.out.println(e); //toString()
//            System.out.println(e.getMessage());
//        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }
}