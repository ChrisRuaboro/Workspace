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

public class Client {

  public static void main(String[] args) {
    // create Department object
    Department dept = new Department("Sales", "Seattle");
    System.out.println(dept);
    
    // add Employees to it
    dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24))); 
    dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2))); 
    
    // list its Employees
    System.out.println("\nList employees:");
    dept.listEmployees();
    
    // make its Employees work
    System.out.println("\nMake employees work:");
    dept.workEmployees();
  }
}