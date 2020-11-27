package com.seleniumexpress.ioc;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("airtel constructor called");
    }

    @Override
    public void calling() {
        System.out.println("calling using airtel mobile");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using airtel sim");
    }
}
