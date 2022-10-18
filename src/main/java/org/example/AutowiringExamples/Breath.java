package org.example.AutowiringExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Breath {
    public static void main(String[] args) {


       ApplicationContext context=new ClassPathXmlApplicationContext("ReferenceInjection.xml");
       HumanBeing hb=context.getBean("h", HumanBeing.class);
       hb.lungs();
    }
}
