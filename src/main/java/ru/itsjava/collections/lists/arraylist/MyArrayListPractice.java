package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("privet");
        list.add("poka");
//        System.out.println("после добавления двух элементов размер равен " + list.size());
        //list.add("poka");
        //list.add("poka");
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
        list.clear();
        System.out.println(list);
    }
}


