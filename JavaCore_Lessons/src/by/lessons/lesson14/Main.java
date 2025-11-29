package by.lessons.lesson14;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        //Задание №1
        //1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
        //Наименование метода: Integer multiplication(int a, int b);
        //2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
        //3. Результат выведите в консоль.
        Multi multi = (a, b) -> {
            return a * b;
        };

        System.out.println(multi.multiplication(5, 10));

        Multi div = (a, b) -> {
            return a / b;
        };

        System.out.println(div.multiplication(5, 10));

        Multi sum = (a, b) -> {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            return a + b;
        };

        System.out.println("===================================================================");


        System.out.println(sum.multiplication(5, 10));

        Car car1 = new Car(1, "BMW", 20000, 2020, 250, 50000);
        Car car2 = new Car(2, "Toyota", 350000, 2010, 180, 10000);
        Car car3 = new Car(3, "Mercedes", 100000, 2025, 250, 150000);
        Car car4 = new Car(4, "BMW", 50000, 2021, 160, 5000);
        Car car5 = new Car(5, "Audi", 20000, 2020, 200, 50000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);

        //1.2 Найти самую быструю машину.
        Optional<Car> fastestCar = cars.stream().max(Comparator.comparingInt(Car::getSpeed));
        System.out.println(fastestCar.get().toString());

        //1.3 Найти самую медленную машину.
        Optional<Car> sloyestCar = cars.stream().min(Comparator.comparingInt(Car::getSpeed));
        System.out.println(sloyestCar.get().toString());

        //1.4 Найти самую старую
        Optional<Car> oldeestCar = cars.stream().min(Comparator.comparingInt(Car::getYear));
        System.out.println(oldeestCar.get().toString());

        //1.5 Найти самую новую
        Optional<Car> newCar = cars.stream().max(Comparator.comparingInt(Car::getYear));
        System.out.println(newCar.get().toString());

        //1.6 Найти машины, у которых пробег от 50000 до 100000.
        List<Car> filteredCars = cars.stream().filter(car -> {
            if (car.getKm() >= 50000 && car.getKm() <= 100000) {
                return true;
            }
            return false;
        }).toList();

        System.out.println(filteredCars);

        //1.7 Найти самую дорогую машину.
        Optional<Car> richestCar = cars.stream().max(Comparator.comparingInt(Car::getPrice));
        System.out.println(richestCar.get().toString());

        //1.8 Найти самую дешёвую машину.
        Optional<Car> chipCar = cars.stream().min(Comparator.comparingInt(Car::getPrice));
        System.out.println(chipCar.get().toString());

        System.out.println("************************************");

        //1.9 Отсортировать машины по пробегу (по возрастанию)
        List<Car> sortedCarsASC = cars.stream().sorted(Comparator.comparingInt(Car::getKm)).collect(Collectors.toList());

        System.out.println(sortedCarsASC);

        System.out.println("************************************");

        //1.9 Отсортировать машины по пробегу (по убыванию)
        List<Car> sortedCarsDESC = cars.stream().sorted(Comparator.comparingInt(Car::getKm).reversed()).collect(Collectors.toList());

        System.out.println(sortedCarsDESC);

        //1.12 Получить не повторяющиеся значения марок авто (distinct).
        List<String> distinctBrand = cars.stream().map(car -> {
                    return car.getBrand();
                }
        ).distinct().toList();

        System.out.println(distinctBrand);

        //1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном
        // диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Car filter = cars.stream().filter(car -> {
            if (car.getPrice() <= 50000 && car.getBrand().equals("BMW") && car.getYear() >= 2010) {
                return true;
            }
            return false;
        }).findFirst().orElseThrow(() -> new ExeptionNotFoundCar("Такой машины нет"));

        System.out.println(filter.toString());


        System.out.println("//////////////////////////////////////////////////////////////////////");


        List<Integer> numbers1 = List.of(1, 2, 3, 6, 51, 2, 6);
        List<Integer> numbers2 = List.of(1, 2, 3, 6, 51, 2, 6);
        List<Integer> numbers3 = List.of(1, 2, 3, 6, 51, 2, 6);
        List<Integer> numbers4 = List.of(1, 2, 3, 6, 51, 2, 6);

        NumberGenerator numberGenerator1 = new NumberGenerator(numbers1);
        NumberGenerator numberGenerator2 = new NumberGenerator(numbers2);
        NumberGenerator numberGenerator3 = new NumberGenerator(numbers3);
        NumberGenerator numberGenerator4 = new NumberGenerator(numbers4);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(numberGenerator1);
        Future <String> future1 = executorService.submit(numberGenerator1);
        Future <String> future2 = executorService.submit(numberGenerator2);
        Future <String> future3 = executorService.submit(numberGenerator3);
        Future <String> future4 = executorService.submit(numberGenerator4);

        try {
            future2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
