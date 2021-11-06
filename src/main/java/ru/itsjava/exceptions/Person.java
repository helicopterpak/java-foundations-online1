package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public String ageCheck() throws AgeNotValidException {
        String text = "try correct age!";
        try {
            if (age < 0 | age > 150) ;
            return text;
        } catch (Exception e) {
            throw new AgeNotValidException();
        }
    }
}
