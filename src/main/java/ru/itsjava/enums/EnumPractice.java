package ru.itsjava.enums;

import lombok.Builder;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.println(season + " ");
        }
        System.out.println();

        Season season = Season.FALL;
        switch (season){
            case FALL:
                System.out.println("it's fall");
                break;
            case SPRING:
                System.out.println("it's SPRING");
                break;
            default:
                System.out.println("it's not spring or fall");
        }
        System.out.println(Coffee.AMERICANO);
        System.out.println(Coffee.AMERICANO.getCharacteristic());

        System.out.println(DayOfTheWeek.FRIDAY);
        System.out.println(DayOfTheWeek.FRIDAY.getTranslation());


    }
}
