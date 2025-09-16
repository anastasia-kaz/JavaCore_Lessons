package by.lessons;

import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {

        // task 1
        int  x1 = 88 / (10 + 12);
        System.out.println(x1);

        System.out.println("===============================================");

        // task 4
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x2");
        int x2 = s.nextInt();
        System.out.println("Введите y");
        int y = s.nextInt();
        System.out.println("Введите z");
        int z = s.nextInt();

        x2+=y;
        y*=z;
        System.out.println("x2: " + x2);
        System.out.println("y: " + y);
        System.out.println("===============================================");


        //task 5 Дано уравнение 213/x+258/x+60=217
        double x3;
        x3 = (217.0 - 60) / (213 + 258);
        System.out.println("x = " + x3);

        System.out.println("===============================================");

        //task 6 Даны значения: x=5; y=2; c=x*y;
        // * 6.2 Расставьте операции инкремента декремента так,
        // * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

        int x = 5;
        int y2 = 2;
        int c = x++ * y2--;

        System.out.println("x: " + x + "     y: " + y2 + "     c: " + c);

        System.out.println("===============================================");

    }
}
