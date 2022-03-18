package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
        System.out.println("manSet= " + manSet);

        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
        System.out.println("manSet = " + manSet);

        Man andrey2 = new Man("Andrey");
        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));

        Fruit apple = new Fruit("apple", 1);
        Fruit orange = new Fruit("orange", 1);
        Fruit melon = new Fruit("melon", 4);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, orange, melon));
        System.out.println("fruitSet= " + fruitSet);

        Fruit grape = new Fruit("grape", 2);
        System.out.println("fruitSet.add(\"grape\", 2) = " + fruitSet.add(grape));
        System.out.println("fruitSet= " + fruitSet);

        Fruit grape2 = new Fruit("grape", 1);
        System.out.println("fruitSet.add(\"grape\", 2) = " + fruitSet.add(grape2));
        System.out.println("fruitSet= " + fruitSet);

        System.out.println("fruitSet.remove(grape) = " + fruitSet.remove(grape));
        System.out.println("fruitSet= " + fruitSet);

        Fruit kiwi = new Fruit("kiwi", 100);
        System.out.println("fruitSet.contains(kiwi) = " + fruitSet.contains(kiwi));
    }
}
