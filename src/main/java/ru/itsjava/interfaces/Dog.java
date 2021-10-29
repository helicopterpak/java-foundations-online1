package ru.itsjava.interfaces;

public class Dog implements Runnable, Walkable, Swimable {
    @Override
    public void run() {
        System.out.println("waf waf");
    }

    @Override
    public int maxRunDistance() {
        return 600;
    }

    @Override
    public void swim() {
        System.out.println("i'm a happy dog!");
    }

    @Override
    public double maxSwimSpeed() {
        return 50.3;
    }

    @Override
    public void walk() {
        System.out.println("too slowly");
    }
}
