package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("privet");
        list.add("poka2");
//        System.out.println("после добавления двух элементов размер равен " + list.size());
        list.add("poka2");
        list.add("poka3");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
//        list.add("poka");
        System.out.println("list.size() = " + list.size());
        System.out.println(list);
        list.isEmpty();
        list.contains("poka");
        //list.clear();
//        System.out.println(list);
//        System.out.println("list.remove(\"privet\") = " + list.remove("privet"));
//        System.out.println("list.size() = " + list.size());
//        System.out.println(list);
        list.add("hello");
        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.remove("hello");
//        System.out.println(list);
        //System.out.println("list.indexOf(\"poka2\") = " + list.indexOf("poka2"));
        System.out.println("list.lastIndexOf(\"poka2\") = " + list.lastIndexOf("poka2"));
        System.out.println("list.get(1) = " + list.get(1));
        list.set(1, "poka1");
        System.out.println(list);
        list.add(1, "poka0");
        System.out.println(list);
    }
}


