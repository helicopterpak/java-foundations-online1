package ru.itsjava.statics;

public class StaticPractise {
    public static void main(String[] args) {
//        System.out.println("Car.price = " + Car.price);
    Car audi = new Car("AUDI", "white");
    Car volga = new Car("ВОЛГА", "black");

        System.out.println("audi.getPrice() = " + audi.getPrice());
        System.out.println("volga.getPrice() = " + volga.getPrice());
    }
}
