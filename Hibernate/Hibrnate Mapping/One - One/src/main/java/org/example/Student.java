package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int sRollno;
    private String sName;
    private int sAge;

    public String getsName() {
        return sName;
    }

    public int getsRollno() {
        return sRollno;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsRollno(int sRollno) {
        this.sRollno = sRollno;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sRollno=" + sRollno +
                ", sAge=" + sAge +
                '}';
    }
}
