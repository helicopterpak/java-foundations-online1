package ru.itsjava.enums;

public enum DayOfTheWeek {
    MONDAY("lundi"), TUESDAY("mardi"), WEDNESDAY("mercredi"), THURSDAY("jeudi"), FRIDAY("vendredi"), SATURDAY("samedi"), SUNDAY("dimanche");

    private String translation;
    DayOfTheWeek(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "DayOfTheWeek{ " + this.name() +
                " (french translation = " + translation + ")}";


    }
}
