package org.example.LifeCycleOfBean.ByAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

    @PostConstruct
    public void init() {
        System.out.println("Initialization is begins...!");
    }

    @PreDestroy
    public  void destroy(){
        System.out.println("Destroy the object....!");
    }
}
