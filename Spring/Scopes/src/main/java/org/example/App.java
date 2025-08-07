package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//             ----singleton----

//        Alien obj= (Alien)context.getBean("alien");
//        obj.a =21;
//        obj.code();
//        System.out.println(obj.a);
//
//        Alien obj2= (Alien)context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.a);
//        for 2 references obj and obj2 also only one object will be created , it doesn't matter how much time you call getbean , it will refer to the same object
//        by default the scope will "singleton"
//        by the time we load the container , objects will be created for the beans which are present in xml file

//        ----prototype----

//        if we want new object for every getbean means we have to mention scope="prototype"

        Alien obj= (Alien)context.getBean("alien");
        obj.a =21;
        obj.code();
        System.out.println(obj.a);

        Alien obj2= (Alien)context.getBean("alien");
        obj2.code();
        System.out.println(obj2.a);

//        by the time we load the container , objects will not be created for the beans which are present in xml file , the objects will be created only when we call getbean

    }
}
