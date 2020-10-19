package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    // FIELDS
    private double salary;

    // CONSTRUCTORS
    public SalariedEmployee()
    {

    }

    public SalariedEmployee(String name, LocalDate hireDate)
    {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary)
    {
        this(name, hireDate);
        setSalary(salary);
    }
    // BUSINESS METHODS

    // this is a responsibility / task ONLy performed by SalariedEmployees (not common)
    public void takeVacation()
    {
        System.out.println(getName() + "is on vacation");
    }
    @Override
    public void pay()
    {
        System.out.println(getName() + " is paid salaried " + getSalary());
    }
    // ACCESSOR METHODS
    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // toString()

    @Override
    public String toString()
    {
        return super.toString() + ", salary=" + getSalary();
    }
}
