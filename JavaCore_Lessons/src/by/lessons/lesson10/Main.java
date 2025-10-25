package by.lessons.lesson10;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine("delongi","варить кофе", 200, false);
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("delongi1","варить кофе", 400, false);
        Fridge fridge = new Fridge("холодильник","atlant", 2000, true);
        Fridge fridge1 = new Fridge("холодильник","atlant1", 2500, true);
        Washer washer = new Washer("стиральна машина","atlant", 6000, true);
        Washer washer1 = new Washer("стиральна машина","atlant1", 6500, true);
        Vacuum vacuum = new Vacuum("пылесос","polaris", 2500, true);
        Vacuum vacuum1 = new Vacuum("пылесос","polaris1", 2500, true);

        Electrical[] exebition = {coffeeMachine, coffeeMachine1, fridge, fridge1, washer,  washer1, vacuum, vacuum1};

        for (Electrical el:exebition) {
            el.work();
        }

        System.out.println("============================================================");
        KitchenElectrical[] kitchenExebition = {coffeeMachine, coffeeMachine1, fridge, fridge1, washer,  washer1};

        for (KitchenElectrical el:kitchenExebition) {
            el.location();
        }

        System.out.println("============================================================");

        CoffeeMachine[] coffeeMachinesExebition = {coffeeMachine, coffeeMachine1};
        for (CoffeeMachine el:coffeeMachinesExebition) {
            el.start();
            el.work();
            el.makeCapuchino();
            el.broken();
        }

        System.out.println("============================================================");
        coffeeMachine.work();
        coffeeMachine1.start();

        fridge.work();
        fridge1.start();

        washer.work();
        washer1.start();

        vacuum.work();
        vacuum1.start();

        System.out.println("============================================================");


        Student st1 = new Student("qa", "nastya", "kazachenok");
        Table<Integer, Character> t1 = new Table<>();
        t1.setCharacterAtTable(st1);
        t1.printCharacter();


        Table<Integer, Character> t2 = new Table();
        Table<Integer, Character> t3 = new Table<>();







    }
}
//7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора