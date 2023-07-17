package com.mycompany.fourteen.interfacepkg;

public class Bird implements Animal, SuperAnimal {//Example of Multiple Inheritance with Interface
    @Override
    public void speak() {
        System.out.println("chirp");
    }
}
