package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("Cuhwis");

        // TODO: call goToWork() on the Employee object
        try {
            emp.goToWork();
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e); //toString()
//            System.out.println(e.getMessage());
        }

    }
}
