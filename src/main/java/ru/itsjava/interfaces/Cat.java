package ru.itsjava.interfaces;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.println("meeeeeow");
    }

    @Override
    public int maxRunDistance() {
        return 200;
    }
}
