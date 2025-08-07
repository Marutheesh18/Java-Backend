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

       Laptop l1=session.get(Laptop.class,3);
        System.out.println(l1);

        Query query= session.createQuery("from Laptop");
        List<Laptop> laptops=query.getResultList();
        System.out.println(laptops);

        Query query2= session.createQuery("from Laptop where ram=32");
        List<Laptop> laptops2=query2.getResultList();
        System.out.println(laptops2);


            session.close();

            Session session2=sf.openSession();


        sf.close();

    }
}