package com.mycompany.six.objectclasses;

public class Employee {

    long employeeID;//state variable
    double salary;//state variable

    //behaviours
    void setEmployeeID(long eid)
    {
        employeeID=eid;
    }
    void setSalary(double s)
    {
        salary=s;
    }

    long getEmployeeID()
    {
        return employeeID;
    }
    double getSalary()
    {
        return salary;
    }

    //Example to show how to Override the toString() method
    @Override
    public String toString()
    {
        String s = "Emp Id = "+ employeeID + " Salary: " + salary;
        return s;
    }
}
