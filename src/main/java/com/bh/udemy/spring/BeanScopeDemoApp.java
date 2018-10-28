package com.bh.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach theAlphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == theAlphaCoach);

        System.out.println(result);

        context.close();
    }
}