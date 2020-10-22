package com.transportation;

public class Motorcycle extends Vehicle
{
    // CONSTRUCTORS
    public Motorcycle(String vin)
    {
        super(vin);
    }

    // BUSINESS METHODS
    @Override
    public void moveTo(String destination)
    {
        System.out.println("Cruising along at 120mph to " + destination);
    }

}
