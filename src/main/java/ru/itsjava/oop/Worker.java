package ru.itsjava.oop;

public class Worker {
    private final String name;
    private int payment;
    private final String function;
    private String schedule;

    public Worker(String name, int payment, String function, String schedule){
        this.name = name;
        this.payment = payment;
        this.function = function;
        this.schedule = schedule;
    }

    public String toString(){
        return name + "'s payment: " + payment + "$ per hour\n" +
                "Main function: " + function  +"\n" +
                "Work schedule: " + schedule + "\n";
    }
}

