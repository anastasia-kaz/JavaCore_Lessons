package by.lessons;

import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {

        // task 1  Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
        //Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        Scanner s = new Scanner(System.in);
//        System.out.println("Введите a");
//        int a = s.nextInt();
//        System.out.println("Введите b");
//        int b = s.nextInt();
//        int c;
//
//        if (a > b) {
//            c = a - b;
//            System.out.println("c = " + c);
//        } else if (a == b){
//            System.out.println("a + b = " + (a + b));
//        } else {
//            System.out.println("b - a = " + (b - a));
//        }
        System.out.println("===============================================");

        // task 2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
        //Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.

//        System.out.println("Введите a");
//        double a = s.nextInt();
//        System.out.println("Введите b");
//        double b = s.nextInt();
//        double c;
//
//        if (a > b && b != 0) {
//            c = a / b;
//            System.out.println( "a / b = " + c);
//        } else if (a != 0) {
//            c = b / a;
//            System.out.println( "b / a = " + c);
//        } else {
//            c = b + a;
//            System.out.println( "b + a = " + c);
//        }
        System.out.println("===============================================");


        //task 3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.

//        System.out.println("Введите d");
//        double d = s.nextInt();
//
//        if (d % 3 == 0){
//            System.out.println("Число d делится на 3");
//        } else {
//            System.out.println("Число d не делится на 3");
//        }

        System.out.println("===============================================");

        //task 4. На вход дано число. Определить, делиться ли оно на 3 и на 7, если нет, тогда проверить делиться ли оно на 3, если не делиться, то проверить, делиться ли оно на 7. Вывести соответствующий текст.

//        System.out.println("Введите e");
//        double e = s.nextInt();
//
//        if (e % 3 == 0 && e % 7 == 0) {
//            System.out.println("Число делится на 3 и на 7");
//        } else if (e % 3 != 0 && e % 7 == 0){
//            System.out.println("Число не делится на 3 и делится на 7");
//        } else if (e % 3 == 0 && e % 7 != 0){
//            System.out.println("Число делится на 3 и не делится на 7");
//        } else {
//            System.out.println("Не делится на 3 и 7");
//        }

        //task 6. На вход даны три числа. Определить максимальное из них

        System.out.println("Введите q");
        double q = s.nextInt();
        System.out.println("Введите w");
        double w = s.nextInt();
        System.out.println("Введите r");
        double r = s.nextInt();
        double max = Integer.MIN_VALUE;

        double arr [] = {q, w, r};
        for (int i = 0; i < arr.length; i++){
            if (max < arr [i]){
                max = arr [i];
            }
        }
        System.out.println("Максимум: " + max);

    }
}
