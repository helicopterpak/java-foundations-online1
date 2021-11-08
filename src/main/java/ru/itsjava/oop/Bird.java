package ru.itsjava.oop;

public class Bird {
    private final String name;
    private final String family;
    private final boolean forHome;
    private String colour;

    public Bird(String name, String family, boolean forHome, String colour){
        this.name = name;
        this.family = family;
        this.colour = colour;
        this.forHome = forHome;
    }

    public String toString(){
        return name + " принадлежит семейству " + family + ", имеет " + colour + " цвет, возможность содержания дома: " + forHome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // условие. если объект равен самому себе
        if (o == null || getClass() != o.getClass()) return false; // если объект нулевой или сравниваются разнуе классы - фолс

        Bird bird = (Bird) o; // приведение типа данных. назначение класса

        if (!name.equals(bird.name)) return false; // если названия не равны, то и объекты не равны
        return family.equals(bird.family); // сравнение значимой характеристики
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    } // выведение хэшеода объекта
}
