package com.mycompany.nine.inheritance;

public class Vehicle {//parent or super

    private String vehicleType;
    final long regNo=0;

    public Vehicle()
    {
        System.out.println("Default Constructor of Super Class Vehicle");
    }

    public Vehicle(String a)
    {
        System.out.println("One Parameterised Constructor of Super Class Vehicle");
        System.out.println(a);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void show()
    {
        System.out.println("I am parent class Vehicle");
    }
}
