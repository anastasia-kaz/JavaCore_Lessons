package by.lessons.lesson10;

public class Fridge implements Electrical, KitchenElectrical{

    private String name;
    private String brand;
    private int cost;
    private Boolean isOn;

    public Fridge(String name, String brand, int cost, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник " + brand + " морозит");
    }

    @Override
    public void broken() {

    }

    @Override
    public void location(){
        System.out.println(name + " находится на кухне");
    }
}


// 4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
