package org.example.LifeCycleOfBean.ByAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Reading {
    public static void main(String[] args) {

        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("ReferenceInjection.xml");
        context.close();
    }

}
