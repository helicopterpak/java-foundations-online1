package ru.itsjava.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Vasya";
    public static final int DEFAULT_AGE = 15;
    public static final int ANOTHER_AGE = 14;

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person newPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        Assertions.assertEquals(DEFAULT_NAME, newPerson.getName());
        Assertions.assertEquals(DEFAULT_AGE, newPerson.getAge());

    }
    @DisplayName("корректно менять возраст")
    @Test
    public void shouldHaveCorrectUpdatePerson() {
        Person newPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        newPerson.setAge(ANOTHER_AGE);
        Assertions.assertEquals(ANOTHER_AGE, newPerson.getAge());
    }

    @DisplayName("корректно прибавлять один год к возрасту")
    @Test
    public void shouldHaveCorrectAddYear() {
        Person newPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        newPerson.birthday();
        Assertions.assertEquals(24, newPerson.getAge() );
    }

    @DisplayName("корректно проверять совершеннолетие")
    @Test
    public void shouldHaveCorrectCheckAge() {
        Person newPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        newPerson.takeBeer();
        Assertions.assertEquals(false, newPerson.takeBeer() );
        Assertions.assertFalse(newPerson.takeBeer());
    }

}
