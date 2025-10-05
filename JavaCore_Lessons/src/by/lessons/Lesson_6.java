package by.lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_6 {

    public static void main(String[] args) {

        // 6. Вывести только нечётные числа от 1 до 100.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("========================================");

        //7. Вывести каждый десяток от 1 до 100.
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("========================================");

        //8. Создать массив из чисел. Вывести макс и мин число.
        int arr[] = {1, 5, 8, 1, 45, 87, 54, 500, 0, -900, 5, 8, 9, 6};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);

        System.out.println("========================================");

        //9. Создать массив чисел от 1 до 100. Вывести полученный массив.
        int[] arr1 = new int[100];
        for (int i = 1; i <= arr1.length; i++) {
            arr1[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("========================================");

        //10. Сортировать массив чисел. Сортировка пузырьком

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("========================================");

        //11. Ввести число с консоли, которое не заканчивается на 0. Вывести среднее значение всех цифр в числе. Использовать оператор %.(цикл while)
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x");
        int x = s.nextInt();
        int sum = 0;

        if (x % 10 == 0) {
            System.out.println("число заканчивается на 0 и не соответствует условиям задачи");
        } else {
            String num = Integer.toString(x);
            int i = 0;

            while (i < num.length()) {
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
                i++;
            }
            double avg = (double) sum/num.length();
            System.out.println("Среднее значение всех цифр в числе: " + avg);
        }


    }
}

