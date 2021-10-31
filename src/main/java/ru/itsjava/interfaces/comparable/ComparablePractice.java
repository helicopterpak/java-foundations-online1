package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Sofia", "Pirozhkova", 13);
        Person person2 = new Person("Anatolij", "Stakanov", 67);
        Person person3 = new Person("Danil", "Stakanov", 21 );
        Person person4 = new Person("Danil", "Stakanov", 44 );
        Person person5 = new Person("Danil", "Stakanovich", 44 );

        System.out.println("person1.compareTo(person2) = " + person1.compareTo(person2));

        Person[] persons = {person1, person2, person3, person4, person5};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person twinPerson1 = (Person) person1.clone();
        System.out.println("person1 = " + person1);
        System.out.println("twinPerson1 = " + twinPerson1);

    }
}
