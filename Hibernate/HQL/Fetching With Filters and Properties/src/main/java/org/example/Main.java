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

        String brand="Asus";
      //  Query query= session.createQuery("from Laptop where brand=?1");
      //  Query query= session.createQuery("select model from Laptop where brand=?1");
          Query query= session.createQuery("select brand,model from Laptop where brand=?1");

        query.setParameter(1,brand);
        // List<Laptop> laptops=query.getResultList();
        // System.out.println(laptops);

        List<Object[]> laptops=query.getResultList(); //for fetching multiple columns
        for(Object[] data : laptops){
            System.out.println((String)data[0] + " " + (String)data[1]);
        }

        session.close();


        sf.close();

    }
}