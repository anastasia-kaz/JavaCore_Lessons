package by.lessons.lesson12;

import by.lessons.lesson12.exception.NotCorrectPasswordException;
import by.lessons.lesson12.exception.UserNotFoundException;
import by.lessons.lesson12.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //1. Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "test0");
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        map.put(4, "test4");
        map.put(5, "test5");
        map.put(6, "test6");
        map.put(7, "test7");
        map.put(8, "test8");
        map.put(9, "test9");
        map.put(10, "test10");

        int result = 1;
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            if (k == 0) {
                System.out.println(map.toString());
                System.out.println("====================================");

            }

            if (k > 5) {
                System.out.println(map.get(k));
            }

            if (map.get(k).length() > 5) {
                result = result * k;
            }
        }
        System.out.println(result);

        authentification();

    }

    public static void authentification() {
        try {
            UserService userService = new UserService();
            userService.authenticate("Sasha", "zxcvb");
        } catch (NotCorrectPasswordException notCorrectPasswordException){
            System.out.println("Вы не прошли аутентификацию" );
        } catch (UserNotFoundException userNotFoundException){
            System.out.println(userNotFoundException.getMessage());
        }





    }


}
