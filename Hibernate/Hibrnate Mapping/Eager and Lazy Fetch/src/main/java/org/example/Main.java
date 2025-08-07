package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1=new Laptop();

        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(5);

        Laptop l2=new Laptop();

        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Laptop l3=new Laptop();

        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3.setRam(64);

        Alien a1=new Alien();

        a1.setAid(101);
        a1.setAname("Maru");
        a1.setTech("Java");

        Alien a2=new Alien();

        a2.setAid(102);
        a2.setAname("Manu");
        a2.setTech("Python");

        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));


        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

            Transaction transaction= session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);

            transaction.commit();

            session.close();

            Session session2=sf.openSession();

         Alien a5 = session2.get(Alien.class, 102); //if you try to print with the same session the select query will not trigger as data will be fetched from cache not from db , only when you access with another session then only select query will trigger
        //System.out.println(a5); //if you don't print values it will not provide values associated with the list/collections , if we print them then only values associated with list/collections will print
      session2.close();

        sf.close();

    }
}