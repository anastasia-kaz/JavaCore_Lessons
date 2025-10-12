package by.lessons.lesson_7;

import java.util.Arrays;

import static by.lessons.lesson_7.Book.getBookByYear;
import static by.lessons.lesson_7.Book.removeBook;

public class Main {

    public static void main(String[] args) {

        //4 В классе main создать массив из пяти книг
        Book book1 = new Book(1554, "book1", "Kazachenok", "QA", 1998, 158, 9.54);
        Book book2 = new Book(1555, "book2", "Voynilko", "SA", 2001, 542, 10);
        Book book3 = new Book(1556, "book3", "Petrova", "DEV", 2010, 15, 7.0);
        Book book4 = new Book(1557, "book4", "Anatsko", "SA", 2025, 125, 99.99);
        Book book5 = new Book(1558, "book5", "Kastukevich", "PM", 1995, 657, 4);
        Book[] books = {book1, book2, book3, book4, book5};

        book2.changePrice(54.55);

        System.out.println(book1.info());

        for (Book book : getBookByYear(books, 2010)) {
            if (book == null) {
                continue;
            }
            System.out.println(book.info());
        }

        System.out.println(Arrays.toString(books));

        System.out.println(Arrays.toString(removeBook(books,1554)));
    }
}
