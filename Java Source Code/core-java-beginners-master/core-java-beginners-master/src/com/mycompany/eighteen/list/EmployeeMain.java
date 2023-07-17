package com.mycompany.eighteen.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] a){

        ArrayList<Employee> empList = new ArrayList<>();
        List<Employee> empList2 = new ArrayList<>();//dynamic polymorphism

        Employee emp = new Employee();
        emp.setEmpId(111L);
        emp.setEmpName("John Doe");
        empList2.add(emp);

        emp = new Employee();
        emp.setEmpId(222L);
        emp.setEmpName("Peter Wyck");
        empList2.add(emp);

        for(Employee e : empList2){
            System.out.println("Employee with Id\t"+e.getEmpId()+" is "+e.getEmpName());
        }

    }
}
