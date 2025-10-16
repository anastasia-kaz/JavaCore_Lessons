package by.lessons.lesson_9;

public class AdminBuilding extends CivilBuilding{
    //1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания. Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.

    private int maxPeople;

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public AdminBuilding(String street, String material, int year, String purpose, int floors, int maxPeople) {
        super(street, material, year, purpose, floors);
        this.maxPeople = maxPeople;
    }

    @Override
    public String toString() {
        return "AdminBuilding{" +
                "maxPeople=" + maxPeople +
                '}';
    }
}
