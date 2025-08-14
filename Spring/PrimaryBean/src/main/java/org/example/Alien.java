package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;


    public Alien(){
       // System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age,Laptop lap){
//        System.out.println("Parameterised Constructor Called");
//
//        this.age=age;
//        this.lap=lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        System.out.println(age);
        com.compile();

    }
}
