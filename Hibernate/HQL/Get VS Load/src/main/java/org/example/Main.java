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

        // Laptop laptop=session.get(Laptop.class,2); //get will fire select query even if you won't print the values/data
        // System.out.println(laptop);

        // Laptop laptop=session.load(Laptop.class,2); //load will fire select query on if you print values otherwise no and now is depricated
        // System.out.println(laptop);

         Laptop laptop=session.byId(Laptop.class).getReference(2); //load will fire select query on if you print values otherwise no and this is an alternative for the "load"
         System.out.println(laptop);
        session.close();


        sf.close();

    }
}