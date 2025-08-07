package org.example;

import jakarta.persistence.*;

@Entity //there will be 3 layers , table name comes from entity name and entity name comes default from class name
@Table(name = "alien_table") //for changing table name
public class Alien {

    @Id
    private int aid;
    @Column(name="alien_name") //used to change column name
    private String aname;
    //If we use transient the variable won't be stored in database
    @Transient
    private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "tech='" + tech + '\'' +
                ", aname='" + aname + '\'' +
                ", aid=" + aid +
                '}';
    }
}

