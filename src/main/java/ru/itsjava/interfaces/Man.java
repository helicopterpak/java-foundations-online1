package ru.itsjava.interfaces;

public class Man implements Walkable {
    @Override
    public void walk() {
        System.out.println("хожу, брожу");
    }
}
