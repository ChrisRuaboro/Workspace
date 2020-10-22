/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 *
 * The Department class manages employees
 *
 * The class includes the following properties:
 *   String name, location.
 *   Employee[] employees: The employees in the department (in an array).
 *   int currentIndex: Internal counter for number of employees in the department
 *    *
 *  The class includes the following methods (besides get/set methods)
 *  void listEmployees(): Output info on all employees in the dept.
 *  void workEmployees(): Tell all the employees in the dept. to work.
 *  String toString(): Generates string from an instance.
 *
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department
{
    // FIELDS
    private String name;
    private String location;
    private List<Employee> employees = new ArrayList<>();
    // private int currentIndex = 0;  // for dealing with array

    // CONSTRUCTORS
    public Department()
    {
    }

    public Department(String name, String location)
    {
        setName(name);
        setLocation(location);
    }

    // BEHAVIORAL METHODS
    // implements all employees toString()
    public void listEmployees()
    {
        // Note that we don't use for-each here because we only want to access the array where employees were added
        // Question: What is in the array for indices where no Employee was added?
        for (Employee i : employees)
        {
            System.out.println(i); // toString() auto called
        }
    }
    // makes all employees work
    public void workEmployees()
    {
        /*for (int i = 0; i < currentIndex; i++)
        {
            employees[i].work();
        }*/
        for (Employee i : employees)
        {
            System.out.println(i); // toString() auto called
        }
    }

    // Pay all employees
    public void payEmployees()
    {
        /*for (int i = 0; i < currentIndex; i++)
        {
            employees[i].pay();
        }*/
        for (Employee i : employees)
        {
            System.out.println(i); // toString() auto called
        }
    }

    // tells all employees to take vacation
    public void holidayBreak()
    {
        for (Employee i : employees)
        {
            if (i instanceof SalariedEmployee)
            {
                // we know that we're really dealing with a SalariedEmployee
                // so we can "downcast" the ref to a more specific SalariedEmployee ref
                // on the fly downcast and method call
                ((SalariedEmployee) i).takeVacation();
            }
            // employees[i].takeVacation();  // can't call this, because the reference is type employee
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp)
    {
        employees.add(emp);
    }

    // ACCESSOR METHODS
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String toString()
    {
        return super.toString() + ", name=" + getName() + ", location=" + getLocation();
    }
}