package ru.itsjava.interfaces;

public class Cow implements Eatable, Talkable{
    @Override
    public void talk() {
        System.out.println("Mmmuuuuuuu");
    }

}
