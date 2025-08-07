package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Alien obj= (Alien)context.getBean("alien");
//        obj.setAge(21);
//        if we want to have default value which spring will inject , we have to do it by property inside its bean . when its create the object alien it will assign the value to the variable here 21 to age
//        the value assigned to age by spring is through setter method , thats why its name setterInjection , this can be confirmed by printing something in setter method
        obj.code();
        System.out.println(obj.getAge());

    }
}
