/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * Lab - Inheritance
 *
 * This is the main class where the application starts.
 *
 * It creates Employees - including derived classes once created, and outputs them to the console.
 *
 */

package com.hr.personnel.client;

import java.time.LocalDate;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

public class HRClient
{

    public static void main(String[] args)
    {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 3500.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 25.0, 37.5));
        dept.addEmployee(new SalariedEmployee("Chris", LocalDate.of(2020,10,05), 5000.0));
        dept.addEmployee(new HourlyEmployee("Francis", LocalDate.of(2015,11,15), 25.50, 40.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay it's employees
        dept.payEmployees();

    }
}