package ru.itsjava.interfaces;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("chic chiric");
    }

    @Override
    public String flyMaxDistance() {
        return ("very high");
    }
}
