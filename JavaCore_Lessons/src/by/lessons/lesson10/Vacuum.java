package by.lessons.lesson10;

public class Vacuum implements Electrical{

    private String name;
    private String brand;
    private int cost;
    private Boolean isOn;

    public Vacuum(String name, String brand, int cost, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос " + brand + " убирает");
    }


}
//6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».