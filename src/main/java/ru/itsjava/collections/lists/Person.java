package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person {
    private final String name;
    private int age;
    private boolean isMale;

    public boolean getMale() {
        return isMale;
    }

}
