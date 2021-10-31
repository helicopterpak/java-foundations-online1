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
        int result = this.firstName.compareTo(person.firstName);
        if (result == 0) {
            int result2 = this.lastName.compareTo(person.lastName);
         if (result2 == 0);}
            return (int) (age - person.age);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
