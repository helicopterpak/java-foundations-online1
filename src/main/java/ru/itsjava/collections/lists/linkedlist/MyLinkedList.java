package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int realSize = 0;
        if (head == null) {
            realSize = 0;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                realSize++;
            }
        }
        return realSize;
    }

    public boolean isEmpty() {
//        if (head != null) {
//        rez = false;}
//        равнозначны ли эти два варианта?
        boolean rez = false;
        if (head == null) {
            rez = true;
        }
        return rez;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        boolean rez = false;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) {
                rez = true;
            }
            curNode = curNode.getNext();
        }
        return rez;
    }

    public boolean add(Object o) {
        Node rezNode = new Node(o, null);
        if (head == null) {
            head = rezNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(rezNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{ " + "head = " + head + " }";
    }
}
