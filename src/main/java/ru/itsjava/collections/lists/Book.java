package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private final String author;
    private int numOfPages;

    @Override
    public String toString() {
        return "Book{ '" + name + "', '" + author + "', " + numOfPages + " }";
    }

}
