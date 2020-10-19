package com.electronic.test;

import com.electronic.Computer;
import com.electronic.TemperatureType;

/*
 * Here, we do validation testing for com.electronic.Computer.
 */
class ComputerValidationTest
{
    public static void main(String[] args)
    {
        // Test left of, on, and right of boundaries
        Computer comp1 = new Computer();
        comp1.setFanSpeed(0);
        System.out.println(comp1.getFanSpeed());
        comp1.setFanSpeed(-1);
        System.out.println(comp1.getFanSpeed());
        comp1.setFanSpeed(7200);
        System.out.println(comp1.getFanSpeed());
        comp1.setNumOfFans(0);
        System.out.println(comp1.getNumOfFans());
        comp1.setNumOfFans(-1);
        System.out.println(comp1.getNumOfFans());
        comp1.setNumOfFans(1);
        System.out.println(comp1.getNumOfFans());
        System.out.println(comp1);
        //Assigning TempType to comp1
        comp1.setTempType(TemperatureType.CELSIUS);

    }
}