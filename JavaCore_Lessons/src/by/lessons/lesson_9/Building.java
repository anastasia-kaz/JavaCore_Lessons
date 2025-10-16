package by.lessons.lesson_9;

public class Building{


    //1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
    private String street;
    private String material;
    private int year;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Building(String street, String material, int year) {
        this.street = street;
        this.material = material;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Building{" +
                "street='" + street + '\'' +
                ", material='" + material + '\'' +
                ", year=" + year +
                '}';
    }
}
