package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

  Laptop l1=session.get(Laptop.class,2);
        System.out.println(l1);


        session.close();

        Session session2=sf.openSession();
        Laptop l2=session2.get(Laptop.class,2);
        System.out.println(l2);
        session2.close();

        sf.close();

    }
}