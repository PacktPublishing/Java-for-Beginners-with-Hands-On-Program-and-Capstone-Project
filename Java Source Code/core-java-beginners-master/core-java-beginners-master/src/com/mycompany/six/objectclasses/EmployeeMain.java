package com.mycompany.six.objectclasses;

public class EmployeeMain {

    public static void main(String[] args){

        Employee ram = new Employee();
        System.out.println(ram.getEmployeeID());
        System.out.println(ram.getSalary());
        System.out.println("*****After setting values of instance variables");
        ram.setEmployeeID(111L);
        ram.setSalary(5656.23);
        System.out.println(ram.getEmployeeID());
        System.out.println(ram.getSalary());

        System.out.println("*****New Object for Peter****");
        Employee peter = new Employee();
        System.out.println(peter.getEmployeeID());
        System.out.println(peter.getSalary());
        System.out.println("*****After setting values of instance variables");
        peter.setEmployeeID(222L);
        peter.setSalary(9999.23);
        System.out.println(peter.getEmployeeID());
        System.out.println(peter.getSalary());

        System.out.println(peter);
    }
}
