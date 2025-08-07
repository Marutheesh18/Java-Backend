package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        //Inserting Data

//        Student s1=new Student();
//
//        s1.setsName("Mahesh");
//        s1.setsAge(23);
//        s1.setsRollno(53);
//
////        Configuration cfg=new Configuration();
////        cfg.addAnnotatedClass(org.example.Student.class);
////        cfg.configure();
////
////        SessionFactory sf= cfg.buildSessionFactory();
////        we can optimize the code like this
//
//        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction= session.beginTransaction();
//
////      session.save(s1); Instead of save now we persist method to math with data JPA , this update came after Hib 6
//        session.persist(s1);
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//        System.out.println(s1);


        //Fetching Data

//        Student s2=null;
//
//        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
//        Session session=sf.openSession();
//
//        s2=session.get(Student.class,55);
//
//        session.close();
//        sf.close();
//
//        System.out.println(s2);


        //Update Data

//        Student s1=new Student();
//
//        s1.setsName("Mahesh");
//        s1.setsAge(25);
//        s1.setsRollno(53);
//
//        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        Transaction transaction= session.beginTransaction();
//
//        session.merge(s1);
//        //merge will search the data in database if the data is present it will select that ,and it will update that , if the data is not there in db then it will insert to the table of db
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//        System.out.println(s1);


        //Delete Data

//        Student s1=new Student();
//
//        SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Student.class).configure().buildSessionFactory();
//
//        Session session=sf.openSession();
//
//        s1=session.get(Student.class, 52);
//        Transaction transaction= session.beginTransaction();
//
//        session.remove(s1);
//        // we can delete the specific data by selecting primary key or else with all values the data
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//        System.out.println(s1);

            //Changing Table and Column Names

            Alien a1=new Alien();

            a1.setAid(101);
            a1.setAname("Maru");
            a1.setTech("Java");

            SessionFactory sf=new Configuration().addAnnotatedClass(org.example.Alien.class).configure().buildSessionFactory();

            Session session=sf.openSession();

            Transaction transaction= session.beginTransaction();

            session.persist(a1);

            transaction.commit();

            session.close();
            sf.close();
            System.out.println(a1);
    }
}