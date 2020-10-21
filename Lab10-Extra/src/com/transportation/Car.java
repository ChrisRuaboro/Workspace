package com.transportation;

public class Car extends Vehicle {
    // INSTANCE VARIABLES
    private String make;
    private String model;

    // CONSTRUCTORS
    public Car(String vin) {
        super(vin);
    }

    public Car(String vin, String make, String model) {
        this(vin);
        setMake(make);
        setModel(model);
    }

    // BUSINESS METHODS
    /*
     * If the destination provided by the client is 'West Seattle' throw the exception
     * to indicate this to the caller, otherwise do your moveTo() as shown
     * Exception is CHECKED must 'throws' in method signature
     */
    @Override
    public void moveTo(String destination) throws DestinationUnreachableException {
        if (destination.equals("West Seattle"))
        throw new DestinationUnreachableException("West Seattle is not a destination you may not travel to");
        else{
            System.out.println(getMake() + " " + getModel() + " moving to " + destination);
        }
    }

    // ACCESSOR METHODS
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}