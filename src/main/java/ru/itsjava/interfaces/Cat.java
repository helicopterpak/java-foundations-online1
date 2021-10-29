package ru.itsjava.interfaces;

public class Cat implements Runnable, Walkable {
    @Override
    public void run() {
        System.out.println("meeeeeow");
    }

    @Override
    public int maxRunDistance() {
        return 200;
    }

    @Override
    public void walk() {
        System.out.println("мяу");
    }
}
