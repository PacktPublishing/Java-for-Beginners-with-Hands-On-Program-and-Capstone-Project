package com.mycompany.ten.abstraction;

public abstract class Employee {

    private String companyName = "xyz Private Limited";

    //this is a concrete method because it has its a body or method implementation
    public String getCompanyName(){
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);
}
