package by.lessons;

public class Lesson_5 {

    public static void main(String[] args) {

        // task 1  Необходимо, чтобы программа отображала следующую последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i <= 100; i += 7) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("========================================");

        // task 2. Необходимо вывести следующую последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512 (цикл while)

        int x = 1;

        while (x <= 512) {
            System.out.print(x + " ");
            x *= 2;
        }

        System.out.println();
        System.out.println("========================================");

        //3. Написать программу, которая посчитает сумму первых 10 чисел (цикл while)

        int a = 0;
        int sum = 0;

        do {
            sum += a;
            a++;
        } while (a <= 10);
        System.out.println(sum);

        System.out.println("========================================");

        //4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)

        int from = 100;
        int to = 1;

        while (from >= to) {
            if (from == to) {
                System.out.print(from);
            } else {
                System.out.print(from + ", ");
            }

            from--;
        };

        System.out.println();
        System.out.println("========================================");

        // 5. Вывести числа от 1 до 100. (while)

        int from2 = 1;
        int to2 = 100;

        while (from2 <= to2) {
            if (from2 == to2) {
                System.out.print(from2);
            } else {
                System.out.print(from2 + ", ");
            }

            from2++;
        };

        System.out.println();
        System.out.println("========================================");
    }
}
