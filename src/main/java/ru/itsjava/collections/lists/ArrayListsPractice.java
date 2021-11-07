package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsPractice {


    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();
        List<Book> booksList20 = new ArrayList<>(20);

        Book book1 = new Book("Harry Potter", "JKR", 700);
        Book book2 = new Book("Twilights", "Stephenie Meyer", 900);
        Book book3 = new Book("The call of the wild", "Jack London", 200);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        System.out.println("booksList = " + booksList);

        System.out.println("booksList.get(0) = " + booksList.get(0));
        System.out.println("booksList.get(2) = " + booksList.get(2));


        Book book4 = new Book("A Game of Thrones", "George R. R. Martin", 1000);
        Book book5 = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1200);
        Book book6 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 100);
        Book book7 = new Book("The Da Vinci Code", "Dan Brown", 600);
        Book book8 = new Book("My Biography", "Julia Pak", 3);

        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        booksList.add(2, book6);
        booksList.add(0, book7);
        System.out.println("booksList = " + booksList);

        booksList20.addAll(booksList);
        System.out.println(booksList20);

        booksList20.remove(0);
        booksList20.remove(book1);
        System.out.println(booksList20);

        System.out.println("booksList20.contains(book7) = " + booksList20.contains(book7)); //почему?? если я её удалила

        System.out.println("List: " + booksList20.toString());
    }
}





