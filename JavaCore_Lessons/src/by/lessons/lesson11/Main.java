package by.lessons.lesson11;

import java.util.*;

public class Main {

    private static String student;

    public static void main(String[] args) {

        System.out.println("========================= 1 =======================================");
        //1. Условие
        //1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
        //1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
        //1.3 Вывести все записи.
        //1.4 Проверить, содержит ли коллекция слово Конфета
        //1.5 Посчитать количество элементов в коллекции

        List<String> ex1 = new ArrayList<>();
        ex1.add("Привет");
        ex1.add("Как дела");
        ex1.add("Праздник");
        ex1.add("Суфле");
        ex1.add("Конфета");
        System.out.println("=======================================");

        for (String s : ex1) {
            System.out.println(s);
        }

        System.out.println("=======================================");

        if (ex1.contains("Конфета")) {
            System.out.println("есть конфета");
        } else {
            System.out.println("нет конфеты");
        }

        System.out.println("=======================================");

        System.out.println(ex1.size());

        System.out.println("========================= 2 =======================================");
        //2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров. Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

        List<String> ex2 = new ArrayList<>();

        ex2.add("молоко");
        ex2.add("сосиски");
        ex2.add("яйца");
        ex2.add("хлеб");
        ex2.add("какао");

        for (String s : ex2) {
            System.out.println(s);
        }

        ex2.remove("сосиски");

        System.out.println("=======================================");

        for (String s : ex2) {
            System.out.println(s);
        }

        System.out.println("========================= 3 =======================================");
        //3. Условие: Создай класс Book с полями:
        //• String title
        //• String author
        //3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
        //3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
        //3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

        Book book1 = new Book("три поросенка", "народ");
        Book book2 = new Book("дюймовочка", "андерсен");
        Book book3 = new Book("маленький принц", "экзюпери");

        List<Book> books = new ArrayList<>(List.of(book1, book2, book3));

        books.remove(1);

        for (Book s : books) {
            System.out.println(s.getTitle());
        }

        System.out.println("========================= 4 =======================================");
        //4. Условие: Создай ArrayList<Integer> и заполни его числами от 1 до 10. Затем создай новый список, в который добавь только чётные числа из первого списка. Выведи оба списка.

        ArrayList<Integer> allIntArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allIntArrayList.add(i);
        }

        for (Integer i : allIntArrayList) {
            System.out.print(i + " ");
        }

        ArrayList<Integer> otherIntArrayList = new ArrayList<>();
        for (Integer i : allIntArrayList) {
            if (i % 2 == 0) {
                otherIntArrayList.add(i);
            }

        };
        System.out.println();
        System.out.println("=======================================");

        for (Integer i : otherIntArrayList) {
            System.out.print(i + " ");
        }

        System.out.println();

        //5. Условие: Создайте ArrayList<String> с именами студентов. Реализуйте метод, который принимает имя и проверяет, есть ли оно в списке. Если имя найдено — выведите сообщение "Имя найдено", иначе — "Имя не найдено".


        ArrayList<String> students = new ArrayList<>();

//        public static void checkStudent(String student){
//            if (students.contains(student)) {
//                System.out.println("Имя найдено");
//            } else {
//                System.out.println("&#x418;&#x43C;&#x44F; &#x43D;&#x435; &#x43D;&#x430;&#x439;&#x434;&#x435;&#x43D;&#x43E;");
//            }
//        }
        System.out.println("========================= 7 =======================================");
        //7. Условие: Создай два множества:
        //• Set<String> setA = {"яблоко", "банан", "киви"}
        //• Set<String> setB = {"банан", "груша", "апельсин"}
        //Объедини их в одно множество и выведи результат.

        Set<String> setA = new HashSet<>(Arrays.asList("яблоко", "банан", "киви"));
        Set<String> setB = new HashSet<>(Arrays.asList("банан", "груша", "апельсин"));

        Set<String> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        System.out.println("Объединенное множество: " + unionSet);


        System.out.println("========================= 8 =======================================");
        //8. Условие: Создай класс Book с полями:
        //• String title
        //• String author
        //Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор). Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book3);

        for (Book book : bookSet) {
            System.out.println(book.getTitle());
        }






    }
}
