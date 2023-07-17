package com.mycompany.eighteen.map;

import com.mycompany.eighteen.list.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemoTwo {

    public static void main(String[] args){

        Map<Long, Employee> mapOfEmployee = new HashMap<>();
        Map<Long, List<Employee>> mapOfEmployeeList = new HashMap<>();
        Map<Long, Map<String, Employee>> mapOfMapEmployee = new HashMap<>();

        Employee emp = new Employee();
        emp.setEmpId(111L);
        emp.setEmpName("John Doe");
        mapOfEmployee.put(emp.getEmpId(), emp);

        emp = new Employee();
        emp.setEmpId(222L);
        emp.setEmpName("Peter Wyck");
        mapOfEmployee.put(emp.getEmpId(), emp);

        Employee resultEmp = mapOfEmployee.get(111L);
        System.out.println(resultEmp.getEmpName());

        for(Map.Entry<Long, Employee> m: mapOfEmployee.entrySet()){
            System.out.println("Emp Id is "+m.getKey()+ " Emp Name is "+m.getValue().getEmpName());
            System.out.printf("Emp Id is %d Emp Name is %s",m.getKey() ,m.getValue().getEmpName());
            System.out.println();
        }
    }
}
