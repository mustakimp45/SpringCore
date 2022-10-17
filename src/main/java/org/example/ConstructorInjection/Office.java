package org.example.ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Office {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ReferenceInjection.xml");
        Employee employee=(Employee) context.getBean("a2");
        System.out.println(employee.toString());
        employee.display();


        Resource res=new ClassPathResource("ReferenceInjection.xml");
        BeanFactory factory=new XmlBeanFactory(res);
        Employee employee1= (Employee) factory.getBean("a2");
        System.out.println("=====================================================");
        System.out.println();
        employee1.display();
    }
}
