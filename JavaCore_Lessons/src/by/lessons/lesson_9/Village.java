package by.lessons.lesson_9;

import java.util.Arrays;

public class Village {

    private int numbersOfBuildings;

    public int getNumbersOfBuildings() {
        return numbersOfBuildings;
    }

    public void setNumbersOfBuildings(int numbersOfBuildings) {
        this.numbersOfBuildings = numbersOfBuildings;
    }
    //1.	Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится: административные здания, жилые здания.

    //2.1  Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим. Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню) (должны придумать,как это сделать)
    //2.2 Реализовать метод по выводу информации о каждой постройке.
    //2.3 Реализовать метод по подсчету общего количества зданий в деревне.
    //2.4 Посчитать количество промышленных зданий в деревне. И вывести информацию о этих зданиях.
    private Building[] buildings = new Building[1];

    public void addBuilding(Building building) {

        int count = 0;
        for (int i = 0; i < buildings.length; i++) {
            count++;
        }

        Building[] newBuildings = new Building[count + 1];
        for (int i = 0; i < count; i++) {
            newBuildings[i] = buildings[i];
        }
        newBuildings[count] = building;
        buildings = newBuildings;

    }

    public int countBuildings (){
        int count = buildings.length+1;
        for (int i = 0; i <= buildings.length; i++) {
            count++;
        };
        numbersOfBuildings = count;
        return count;
    };

    @Override
    public String toString() {
        return "Village{" +
                "buildings=" + Arrays.toString(buildings) +
                '}';
    }
}
