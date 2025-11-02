package by.lessons.lesson11;

import java.util.Objects;

public class Book {

    //3. Условие: Создай класс Book с полями:
    //• String title
    //• String author
    //3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
    //3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
    //3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }


}
