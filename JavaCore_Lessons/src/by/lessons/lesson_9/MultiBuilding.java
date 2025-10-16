package by.lessons.lesson_9;

public class MultiBuilding extends CivilBuilding{
    //1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.
    private int numberOfAppartments;

    public int getNumberOfAppartments() {
        return numberOfAppartments;
    }

    public void setNumberOfAppartments(int numberOfAppartments) {
        this.numberOfAppartments = numberOfAppartments;
    }

    public MultiBuilding(String street, String material, int year, String purpose, int floors, int numberOfAppartments) {
        super(street, material, year, purpose, floors);
        this.numberOfAppartments = numberOfAppartments;
    }

    @Override
    public String toString() {
        return "MultiBuilding{" +
                "numberOfAppartments=" + numberOfAppartments +
                '}';
    }
}
