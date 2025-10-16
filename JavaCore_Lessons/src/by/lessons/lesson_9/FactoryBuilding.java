package by.lessons.lesson_9;

public class FactoryBuilding extends IndustrialBuilding {
    //1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
    private int numberOfWorkers;
    private String product;

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public FactoryBuilding(String street, String material, int year, String industry, int numberOfWorkers, String product) {
        super(street, material, year, industry);
        this.numberOfWorkers = numberOfWorkers;
        this.product = product;
    }


    @Override
    public String toString() {
        return "FactoryBuilding{" +
                "numberOfWorkers=" + numberOfWorkers +
                ", product='" + product + '\'' +
                '}';
    }
}