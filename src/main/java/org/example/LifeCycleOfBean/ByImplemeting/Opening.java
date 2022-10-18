package org.example.LifeCycleOfBean.ByImplemeting;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Opening {

    public static void main(String[] args) {
       ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("ReferenceInjection.xml");
        context.close();
    }
}
