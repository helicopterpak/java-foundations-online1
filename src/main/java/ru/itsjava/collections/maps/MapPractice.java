package ru.itsjava.collections.maps;


import java.util.HashMap;
import java.util.HashSet;
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

        Fruits apple = new Fruits("apple", 1);
        Fruits orange = new Fruits("orange", 2);
        Fruits melon = new Fruits("melon", 3);
        Fruits melon2 = new Fruits("Melon", 4);
        Fruits melon3 = new Fruits("MElOn", 5);

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

        System.out.println("task 1:");
        Map<Man, Fruits> buyer = new HashMap<>();
        buyer.putAll(men);
        System.out.println("Map BUYER:");
        for (Man keyBuyer : buyer.keySet()) {
            System.out.println(keyBuyer + ": " + buyer.get(keyBuyer));
        }

        System.out.println("task 2:");
        System.out.println("men.get(petrov) = " + men.get(petrov));

        // System.out.println("task 3:");
        //men.remove(ivanov);
//        System.out.println("after delete Ivanov:");
//        for (Man keyMan: men.keySet()) {
//            System.out.println(keyMan + ": " + men.get(keyMan));
//        }

        System.out.println("task 4:");
        Fruits kiwi = new Fruits("kiwi", 7);
        System.out.println("men.containsValue(kiwi) = " + men.containsValue(kiwi));


        System.out.println("task 5:");
        System.out.println("men.keySet() = " + men.keySet());
        System.out.println("men.values() = " + men.values());
        System.out.println("men.entrySet() = " + men.entrySet());

        System.out.println("task 6:");
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

        System.out.println("task 7:");
        int melonCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getValue().equals(melon)) {
                melonCount++;
            }
            if ((melonCount > 2) & (pair.getValue().equals(melon))) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }

        }

        System.out.println("-------------------");

        int aCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getKey().getName().startsWith("P")) {
                aCount++;
            }
            if ((aCount > 2) & (pair.getKey().getName().startsWith("P"))) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }

        }

        System.out.println("task 8:");
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("melon")) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }

        System.out.println("task 9:");
        Map<Man, Fruits> buyer2 = new HashMap<>();
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            if ((pair.getValue().equals(melon)) || (pair.getValue().equals(apple))) {
                buyer2.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println("Map BUYER2:");
        for (Man keyBuyer2 : buyer2.keySet()) {
            System.out.println(keyBuyer2 + ": " + buyer2.get(keyBuyer2));
        }

        System.out.println("task 10:");
        int middleWeight = 0;
        int weightCount = 0;
        for (Map.Entry<Man, Fruits> pair : men.entrySet()) {
            middleWeight = middleWeight + pair.getValue().getWeight();
            weightCount++;
        }
        middleWeight = middleWeight / weightCount;
        System.out.println(middleWeight);
    }


}
