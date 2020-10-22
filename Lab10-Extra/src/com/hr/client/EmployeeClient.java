package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // DONE: create an instance of Employee
        Employee emp = new Employee("Cuhwis");

        // DONE: call goToWork() on the Employee object
        //NOTE: both could throw a checked exception
        try
        {
            emp.goToWork();
            emp.goHome();
        }
        catch (WorkException e)
        {
            System.out.println(e); //toString()
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        catch (DestinationUnreachableException e)
        {
            System.out.println(e);
        }
    }
}
