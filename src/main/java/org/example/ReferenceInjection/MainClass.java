package org.example.ReferenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
         ApplicationContext applicationContext= new ClassPathXmlApplicationContext("ReferenceInjection.xml");

        Match match=(Match) applicationContext.getBean("match");
        System.out.println(match.getRuns());
        System.out.println(match.getTeam());
        System.out.println(match.getPlayers().getName());
        System.out.println(match.getPlayers().getNumber());
        System.out.println(match.getPlayers().getStrikeRate());
        System.out.println(match);
    }
}
