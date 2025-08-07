package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop lap;


    public Alien(){
        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
    public Alien(int age,Laptop lap){
        System.out.println("Parameterised Constructor Called");

        this.age=age;
        this.lap=lap;
    }

    public void code(){
        System.out.println("Coding");
        System.out.println(age);
        lap.compile();

    }
}
