package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop l1=new Laptop();

        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(5);

        Alien a1=new Alien();

        a1.setAid(101);
        a1.setAname("Maru");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

            Transaction transaction= session.beginTransaction();

        session.persist(l1);
        session.persist(a1);

            transaction.commit();

            session.close();
            sf.close();
            System.out.println(a1);
    }
}