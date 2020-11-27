package com.seleniumexpress.ioc;

import com.seleniumexpress.ioc.Sim;

public class Vodaphone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling using vodaphone mobile");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using vodaphone sim");
    }
}
