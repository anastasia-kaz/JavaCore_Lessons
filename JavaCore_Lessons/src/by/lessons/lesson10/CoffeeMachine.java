package by.lessons.lesson10;

public class CoffeeMachine implements Electrical, KitchenElectrical{

    private String name;
    private String functional;
    private int cost;
    private Boolean isOn;

    public CoffeeMachine(String name, String functional, int cost, Boolean isOn) {
        this.name = name;
        this.functional = functional;
        this.cost = cost;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина " + name + " варит кофе");
    }


    @Override
    public void start() {
        if (isOn==false){
            System.out.println("кофемашина включена");
            isOn = true;
        }else {
            System.out.println("кофемашина выключена");
        }
    }

    public void makeCapuchino(){
        System.out.println("Кофемашина " + name + " варит капучино");
    }

    @Override
    public void location(){
        System.out.println(name + " находится на кухне");
    }


}
//3.	Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».