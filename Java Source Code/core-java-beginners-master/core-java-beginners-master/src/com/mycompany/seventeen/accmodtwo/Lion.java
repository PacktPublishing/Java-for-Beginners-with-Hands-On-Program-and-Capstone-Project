package com.mycompany.seventeen.accmodtwo;

import com.mycompany.seventeen.accmodone.Animal;

public class Lion extends Animal {

    public void display()
    {
        /*Animal animal = new Animal();
        System.out.println(animal.canFly); test*/
        System.out.println(canFly);//protected members can be accessed outside the package in the child classes
    }
}
