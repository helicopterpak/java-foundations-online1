package ru.itsjava.collections.maps;

import ru.itsjava.collections.sets.Fruit;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, Fruits> men = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man petrov = new Man("Petrov");
        Man kotov = new Man("Kotov");
        Man pak = new Man("Pak");
        Man borisov = new Man("Borisov");
        Man petrov2 = new Man("Petrov2");
        Man pak2 = new Man("Pak2");

        Fruits apple = new Fruits("apple");
        Fruits orange = new Fruits("orange");
        Fruits melon = new Fruits("melon");
        Fruits melon2 = new Fruits("Melon");
        Fruits melon3 = new Fruits("MElOn");

        men.put(ivanov, apple);
        men.put(sidorov, orange);
        men.put(petrov, melon);
        men.put(kotov, melon);
        men.put(pak, melon);
        men.put(borisov, melon);
        men.put(petrov2, melon2);
        men.put(pak2, melon3);




        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("---------------");
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

//        men.remove(ivanov);
//        System.out.println("after delete Ivanov:");
//        for (Man keyMan: men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }

        // task 1
        Map<Man, Fruits> buyer = new HashMap<>();
        buyer.putAll(men);
        System.out.println("Map BUYER:");
        for (Man keyBuyer : buyer.keySet()) {
            System.out.println(keyBuyer + ": " + buyer.get(keyBuyer));
        }

        // task 2
        System.out.println("men.get(petrov) = " + men.get(petrov));

        // task 3
        //for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (men.getValue().equals(apple)) {
                men.remove(men.getKey(), men.getValue()); //НЕ РАБОТАЕТ((
            }
       // }
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        // task 4
        Fruits kiwi = new Fruits("kiwi");
        System.out.println("men.containsValue(kiwi) = " + men.containsValue(kiwi));


        // task 5
        System.out.println("men.keySet() = " + men.keySet());
        System.out.println("men.values() = " + men.values());
        System.out.println("men.entrySet() = " + men.entrySet());

        // task 6
        int keyCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getKey().length() > 5) {
                keyCount++;
            }
        }
        System.out.println("количество ключей длина которых больше 5: " + keyCount);

        int valueCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getValue().equals(melon)) {
                valueCount++;
            }
        }
        System.out.println("количество элементов, которые равны 'melon': " + valueCount);

        // task 7
        int melonCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getValue().equals(melon)) {
                melonCount++;
                if (melonCount > 2) {
                    System.out.println(pair.getKey() + ": " + pair.getValue()); //ПОЧЕМУ ВЫВОДИТ 1Й И 4Й ЭЛЕМЕНТЫ???
                }
            }
        }

        System.out.println("-------------------");

        int aCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getKey().startsWith("p")) {
                aCount++;
                if (aCount > 2) {
                    System.out.println(pair.getKey() + ": " + pair.getValue()); //ПОЧЕМУ РАБОТАЕТ НЕКОРРЕКТНО???
                }
            }
        }


    }
}
