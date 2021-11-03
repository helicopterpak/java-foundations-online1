package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Juli";
//        String copyName = "Juli";
//
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Juli");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        String internConstructorName = constructorName.intern();
//
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));
        String str = "Я строка";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);

//        for (int i = 0; i < 1000; i++) {
//            str = str + "!";
//        }

        StringBuilder builderStr = new StringBuilder(str);
        for (int i = 0; i < 1000; i++) {
            builderStr.append('!');
        }
        System.out.println(builderStr.toString());

        byte[] str2 = str.getBytes(); //кодирование строки в последовательность баййтов
        System.out.println(str2);

        System.out.println(str.toUpperCase()); // преобразует все знаки в верхний регистр

        System.out.println(str.charAt(4)); //выводит символ указанного индекса

        System.out.println(str.replace("Я", "ты")); //замена символов


    }
}
