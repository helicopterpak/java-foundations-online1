package ru.itsjava.collections.lists;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
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

        System.out.println("Индекс делится на 3:");
        for (int i = 0; i < booksList.size(); i++) {
            if ((i % 3) == 0) {
                System.out.println(booksList.get(i));
            }
        }

        System.out.println("Вернуть количество книг, которые равны \"Java\":");
        int count = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getName().equals("Java")) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Пропустить первые 3 книги в списке.");
        System.out.println("Исходный список: " + booksList);
        int bookCount = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (bookCount < 3) {
                bookCount++;
            } else {
                System.out.println(booksList.get(i));
            }
        }

        System.out.println("Пропустить первые 2 книги, которые равные \"The Da Vinci Code\"");
        bookCount = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getName().equals("The Da Vinci Code") && bookCount < 2) {
                bookCount++;
            } else {
                System.out.println(booksList.get(i));
            }
        }

        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3.");
        for (Book book : booksList) {
            if ((book.getAuthor().length()) % 3 == 0) {
                System.out.println(book + " ");
                break;
            }
        }

        System.out.println("Возвращаем все книги, длина автора которых делится на 3.");
        for (Book book : booksList) {
            if ((book.getAuthor().length()) % 3 == 0) {
                System.out.println(book + " ");
            }
        }


        Person p1 = new Person("Dan", 22, true);
        Person p2 = new Person("Pam", 24, false);
        Person p3 = new Person("Hector", 29, true);
        Person p4 = new Person("Hector", 19, true);
        Person p5 = new Person("Holy", 63, false);
        Person p6 = new Person("Dan", 9, true);
        Person p7 = new Person("Nancy", 7, false);
        Person p8 = new Person("Herb", 26, true);

        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));
        for (Person person : persons) {
            if ((person.getName().charAt(0) == 'H')
                    && (person.getAge() < 27)
                    && (person.getAge() > 18)
                    && (person.getMale() == true)) {
                System.out.println(person + " ");
            }
        }


        for (Person person : persons) {
            int femCount = 0;
            for (int i = 0; i < persons.size(); i++) {
                if (person.get(i).getMale() == false) {
                    femCount++;
                } else { System.out.println(femCount);}
            }

        }

//        for (Person person : persons) {
//            int femCount = 0;
//            int sumAge = 0;
//            if (person.getMale() == false) {
//
//                for (int i = 0; i < persons.size(); i++) {
//                    sumAge += person.getAge();
//                    femCount++;
//                }
//
//            } else {
//                System.out.println(sumAge / femCount);
//
//            }
//        }


    }
}














