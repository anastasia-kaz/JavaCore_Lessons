package by.lessons.lesson14;

public class Car {

    private int id;
    private String brand;
    private int km;
    private int year;
    private int speed;
    private int price;

    public Car(int id, String brand, int km, int year, int speed, int price) {
        this.id = id;
        this.brand = brand;
        this.km = km;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", km=" + km +
                ", year=" + year +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
