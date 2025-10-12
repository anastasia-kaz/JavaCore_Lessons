package by.lessons.lesson_8;

public class Strings {
    public static void main(String args[]) {
        String str = "I like Java";
        int length = str.length();
        char resultChar = str.charAt(length - 1);
        System.out.println(resultChar);

        boolean isTrue = str.endsWith("java!");
        System.out.println("заканчивается ли ваша строка подстрокой = " + isTrue);

        String resultStr = str.substring(7, 11);
        System.out.println(resultStr);
        int indexStart = str.indexOf("Java");
        String strJava = "Java";
        String resultStrFinal = str.substring(indexStart, indexStart + strJava.length());
        System.out.println(resultStrFinal);


    }
}
