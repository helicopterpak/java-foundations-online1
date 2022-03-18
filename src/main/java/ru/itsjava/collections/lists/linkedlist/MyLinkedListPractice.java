package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("line 1");
        list.add("line 2");
        list.add("line 3");
        list.add("line 4");
        list.add("line 5");
        list.add("line 5");
        list.add("line 1");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"line 1\") = " + list.contains("line 2"));
//        list.remove(1);
//        System.out.println("list = " + list);
//        list.clear();
//        System.out.println("list = " + list);
        System.out.println("list.get(2) = " + list.get(1));
        list.set(3,"!!LINE 8!!");
        System.out.println("list = " + list);
        list.add(0,"line24");
        System.out.println("list = " + list);
        System.out.println("list.indexOf(\"line 3\") = " + list.indexOf("line 3"));
        System.out.println("list.lastIndexOf(\"line 1\") = " + list.lastIndexOf("line 1"));
        System.out.println("list.lastIndexOf(\"line 5\") = " + list.lastIndexOf("line 5"));
        System.out.println("list.lastIndexOf(\"line 3\") = " + list.lastIndexOf("line 3"));
        list.remove("line 1");
        System.out.println("list = " + list);

        //System.out.println(5==6);
    }
}
