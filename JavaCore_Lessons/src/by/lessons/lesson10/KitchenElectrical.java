package by.lessons.lesson10;

public interface KitchenElectrical {


    default void broken(){
        System.out.println("техника ломается");
    };

    void location();

}

//8. Создайте интерфейс Кухонная техника. От этого интерфейса выполните имплементацию у классов Холодильник и Стиральная машина