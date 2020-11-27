package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.StyledEditorKit;

public class Mobile {

    public static void main(String[] args) {

        // Old way
        Sim airtel1 = new Airtel();
        airtel1.calling();
        airtel1.data();

        Sim vodaphone1 = new Vodaphone();
        vodaphone1.calling();
        vodaphone1.data();

        // New Way
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");

        Sim airtel2 = (Sim) context.getBean("airtel"); // requires typecasting
        airtel2.calling();
        airtel2.data();

        Sim vodaphone2 = context.getBean("vodaphone", Sim.class); // does not require typecasting
        vodaphone2.calling();
        vodaphone2.data();

    }

}
