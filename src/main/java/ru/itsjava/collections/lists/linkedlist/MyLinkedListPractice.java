package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("line 1");
        list.add("line 2");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"line 1\") = " + list.contains("line 2"));

    }
}
