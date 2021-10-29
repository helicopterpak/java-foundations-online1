package ru.itsjava.interfaces;

public class Fish implements Swimable{
    @Override
    public void swim() {
        System.out.println("bul' bul' bul'");
    }

    @Override
    public double maxSwimSpeed() {
        return 300.5;
    }
}
