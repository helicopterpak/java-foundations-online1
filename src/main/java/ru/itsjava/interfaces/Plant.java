package ru.itsjava.interfaces;

public class Plant implements Eatable {
    @Override
    public void eat() {
        System.out.println("give me a water and sun!!!");
    }
}
