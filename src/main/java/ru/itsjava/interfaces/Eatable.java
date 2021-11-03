package ru.itsjava.interfaces;

public interface Eatable {
    default void eat() {
        System.out.println("i loooove eat!!!");
    }
}
