package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien alien = (Alien) context.getBean("alien");
//        System.out.println(alien.getAge());
//        alien.show();

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop= context.getBean(Desktop.class);
        Desktop desktop1=context.getBean(Desktop.class);
        desktop.compile();
        desktop1.compile();
    }
}
