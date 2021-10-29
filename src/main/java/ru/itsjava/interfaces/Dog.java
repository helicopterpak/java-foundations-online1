package ru.itsjava.interfaces;

public class Dog implements Runnable{
    @Override
    public void run() {
        System.out.println("waf waf");
    }

    @Override
    public int maxRunDistance() {
        return 600;
    }
}
