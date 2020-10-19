package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee
{
    // Static variable
    public static final double TAX_RATE = 0.25;

    // FIELDS
    private double rate;
    private double hours;

    public HourlyEmployee()
    {
    }

    public HourlyEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours)
    {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }
    // BUSINESS METHODS
    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid hourly " + (getRate()*getHours()));
    }

    @Override // interface TaxPayer
    public void payTaxes()
    {
        double taxes = getRate() * getHours() * TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getHours()
    {
        return hours;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}
