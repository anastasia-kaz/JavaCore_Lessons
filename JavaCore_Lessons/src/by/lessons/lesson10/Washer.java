package by.lessons.lesson10;

public class Washer implements Electrical, KitchenElectrical{

    private String name;
    private String brand;
    private int cost;
    private Boolean isOn;

    public Washer(String name, String brand, int cost, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина " + brand + "  стирает");
    }


    @Override
    public void broken() {

    }

    @Override
    public void location(){
        System.out.println(name + " находится на кухне");
    }
}
//5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».