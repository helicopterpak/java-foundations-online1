package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arraylist.MyArrayList;

@DisplayName("MyArrayList должен: ")

public class MyArrayListTest {
    MyArrayList list = new MyArrayList();

    public static final Object DEFAULT_ELEMENT = "element1";
    public static final Object DEFAULT_ELEMENT2 = "element2";

    @DisplayName("корректно выводить размер листа")
    @Test
    public void shouldHaveCorrectPrintSize() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(1, list.size());
    }

    @DisplayName("корректно добавлять элемент в массив")
    @Test
    public void shouldHaveCorrectAddElement() {
        Assertions.assertEquals(true, list.add(DEFAULT_ELEMENT));
        Assertions.assertEquals(true, list.contains(DEFAULT_ELEMENT));
    }

    @DisplayName("корректно проверять, пустой ли массив")
    @Test
    public void shouldHaveCorrectCheckEmptiness() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(false, list.isEmpty());
    }

    @DisplayName("корректно проверять наличие элемента в массиве")
    @Test
    public void shouldHaveCorrectCheckHavingObject() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(true, list.contains(DEFAULT_ELEMENT));
    }

    @DisplayName("корректно удалять все элементы из массива")
    @Test
    public void shouldHaveCorrectClearList() {
        list.add(DEFAULT_ELEMENT);
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @DisplayName("корректно удалять элемент из массива")
    @Test
    public void shouldHaveCorrectRemoveElement() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(true, list.remove(DEFAULT_ELEMENT));
        Assertions.assertEquals(0, list.size());
    }

    @DisplayName("корректно удалять элемент из массива по индексу элемента")
    @Test
    public void shouldHaveCorrectRemoveElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(DEFAULT_ELEMENT2);
//        Assertions.assertEquals(DEFAULT_ELEMENT, list.remove(0));
//        Assertions.assertEquals(DEFAULT_ELEMENT2, list.get(0));
        Assertions.assertEquals(DEFAULT_ELEMENT2, list.remove(1));
//        Assertions.assertEquals(null, list.get(1));
        Assertions.assertEquals(1, list.size());
    }

    @DisplayName("корректно выводить элемент по индексу")
    @Test
    public void shouldHaveCorrectPrintElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(DEFAULT_ELEMENT2);
        Assertions.assertEquals(DEFAULT_ELEMENT, list.get(0));
    }

    @DisplayName("корректно заменять элемент")
    @Test
    public void shouldHaveCorrectChangeElement() {
        list.add(DEFAULT_ELEMENT);
        list.add(DEFAULT_ELEMENT2);
        Assertions.assertEquals(DEFAULT_ELEMENT, list.set(1, DEFAULT_ELEMENT));
    }

    //не уверена в правильности
    @DisplayName("корректно добавлять элемент в массив по индексу")
    @Test
    public void shouldHaveCorrectAddElementByIndex() {
        list.add(DEFAULT_ELEMENT);
        list.add(0, DEFAULT_ELEMENT2);
        Assertions.assertEquals(DEFAULT_ELEMENT2, list.get(1));
    }

    @DisplayName("корректно выводить индекс элемента")
    @Test
    public void shouldHaveCorrectPrintIndexOfObject() {
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(0, list.indexOf(DEFAULT_ELEMENT));
    }

    @DisplayName("корректно выводить последний индекс элемента")
    @Test
    public void shouldHaveCorrectPrintLastIndexOfObject() {
        list.add(DEFAULT_ELEMENT);
        list.add(DEFAULT_ELEMENT2);
        list.add(DEFAULT_ELEMENT);
        Assertions.assertEquals(2, list.lastIndexOf(DEFAULT_ELEMENT));
    }
}
