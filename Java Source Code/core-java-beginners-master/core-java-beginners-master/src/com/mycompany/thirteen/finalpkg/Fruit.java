package com.mycompany.thirteen.finalpkg;

public /*final*/ class Fruit {

    String fruitColour;
    public final void displayName()//final method cannot be overridden
    {
        System.out.println("Fruit Parent Class");
    }
}
