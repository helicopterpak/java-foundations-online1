package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private String brand;
    private String colour;
    private static int price = 500;

    public int getPrice() {
        return price;
    }
}
