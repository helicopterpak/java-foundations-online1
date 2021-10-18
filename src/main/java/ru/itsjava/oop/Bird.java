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
}
