package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void ageCheck() throws AgeNotValidException {
        if ((age < 0) || (age > 150))
            throw new AgeNotValidException("try correct age");

    }
}
