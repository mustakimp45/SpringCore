package org.example;

import org.example.entity.Cricket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context=new ClassPathXmlApplicationContext("org/example/ReferenceInjection/config.xml");
        Cricket cricket=(Cricket)context.getBean("player");
        System.out.println(cricket.getRuns());
        System.out.println(cricket.getWickets());
        System.out.println(cricket.getGround());


    }
}