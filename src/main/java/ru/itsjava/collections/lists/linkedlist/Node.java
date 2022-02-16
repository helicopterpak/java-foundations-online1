package ru.itsjava.collections.lists.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Node { //что такое узел
    private Object value;
    private Node next;
}
