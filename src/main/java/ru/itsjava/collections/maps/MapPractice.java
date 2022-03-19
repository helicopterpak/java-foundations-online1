package ru.itsjava.collections.maps;

import ru.itsjava.collections.sets.Fruit;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man petrov = new Man("Petrov");

        men.put(ivanov, "apple");
        men.put(sidorov, "orange");
        men.put(petrov, "melon");

        Fruits apple = new Fruits("apple");
        Fruits orange = new Fruits("orange");
        Fruits melon = new Fruits("melon");


        for (Map.Entry<Man, String> pair: men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("---------------");
        for (Man keyMan: men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        men.remove(ivanov);
        System.out.println("after delete Ivanov:");
        for (Man keyMan: men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        System.out.println("men.get(petrov) = " + men.get(petrov));

        ru.itsjava.collections.sets.Fruit kiwi = new Fruit("kiwi", 100);
        System.out.println("men.containsValue(kiwi) = " + men.containsValue(kiwi));

        System.out.println("men.keySet() = " + men.keySet());
        System.out.println("men.values() = " + men.values());
        System.out.println("men.entrySet() = " + men.entrySet());

        Map<Man, String> buyer = new HashMap<>();
        buyer.putAll(men);
        System.out.println("Map BUYER:");
        for (Man keyBuyer: buyer.keySet()) {
            System.out.println(keyBuyer + ": " + buyer.get(keyBuyer));
        }


    }
}
