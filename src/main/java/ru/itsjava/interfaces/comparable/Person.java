package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String firstName;
    private final String lastName;
    private double age;


    @Override
    public int compareTo(Person person) {
        int comparisonByName = this.firstName.compareTo(person.firstName);

        if (comparisonByName != 0) return comparisonByName;

        int comparisonByLastName = this.lastName.compareTo(person.lastName);
        if (comparisonByLastName != 0) return comparisonByLastName;

        return (int) (age - person.age);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
