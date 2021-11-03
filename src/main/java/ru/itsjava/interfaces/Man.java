package ru.itsjava.interfaces;

public class Man implements Walkable, Runnable, Swimable, Talkable {
    @Override
    public void walk() {
        System.out.println("хожу, брожу");
    }

    @Override
    public void run() {
        System.out.println("бегу, волосы назад");
    }

    @Override
    public int maxRunDistance() {
        return 20000;
    }

    @Override
    public void swim() {
        System.out.println("не тону");
    }

    @Override
    public double maxSwimSpeed() {
        return 6.7;
    }
}



