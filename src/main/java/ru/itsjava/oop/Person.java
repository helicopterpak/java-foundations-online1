package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    final String name;
    int age;

    public void birthday() {
        int ageAfter = age + 1;
        System.out.println(ageAfter);
    }

    public boolean takeBeer() {
        if (age >= 18) {return true;}
        return false;

    }
}
