package by.lessons.lesson_7;

public class Book {


    //1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ),
    // Год издания(тип Int), Количество старниц (тип int), цена (double).Инициализацию книги в классе main выполнять
    // через конструктор с параметрами. Также определите конструктор без параметров.
    int id;
    String name;
    String author;
    String publish;
    int year;
    int page;
    double price;

    public Book (int id, String name, String author, String publish, int year, int page, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.page = page;
        this.price = price;
    }

    public Book(){
    }


    //2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public String info() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", year=" + year +
                ", page='" + page + '\'' +
                ", price=" + price +
                '}';
    }

    //3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
    public void changePrice(double price) {
        this.price = price;
    }


    //5 Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год издания
    // ниже переданнго года в методе.
    public static Book[] getBookByYear(Book[] booksArray, int year) {
        Book[] result = new Book[booksArray.length];
        for (int i = 0; i < booksArray.length; i++){
            if (booksArray[i].year < year){
                result[i] = booksArray[i];
            }
        }
        return result;
    }

    //6 Создайте метод, который будет принимать массивкниг и дентификатор (id)книги,которую надо удалить из этого массива.
    // Сам метод будет возвращать массив книг.Сигнатура метода: public Book[]removeBook(Book[]books, intidRemoveBook

    public static Book[] removeBook(Book[] booksArray, int id) {
        Book[] resultArray = new Book[booksArray.length-1];
        int newIndex = 0;
        for (int i = 0; i < booksArray.length; i++){
            if (booksArray[i].id != id){
                resultArray[newIndex] = booksArray[i];
                newIndex++;
            }
        }
        return resultArray;
    };


}
