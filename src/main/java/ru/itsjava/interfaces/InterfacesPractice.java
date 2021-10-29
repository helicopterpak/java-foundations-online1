package ru.itsjava.interfaces;

public class InterfacesPractice {

    public static void main(String[] args) {
        Walkable juli = new Man();
        juli.walk();

        Runnable puppy = new Dog();
        puppy.run();

        Runnable kitty = new Cat();
        System.out.println("kitty.maxRunDistance() = " + kitty.maxRunDistance());

        Flyable littleBird = new Bird();
        littleBird.fly();
        System.out.println("littleBird.flyMaxDistance() = " + littleBird.flyMaxDistance());

        Swimable dory = new Fish();
        dory.swim();
        System.out.println("dory.maxSwimSpeed() = " + dory.maxSwimSpeed());
    }
}
