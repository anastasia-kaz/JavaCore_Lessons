package by.lessons.lesson13;


//Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
//Использовать Reader, Writer
//1. Записать его в файл прописал относительный путь.
//2. Записать его в файл прописав абсолютный путь.
//3. Вычитать текст из первого файла.
//4. Вычитать текст из второго файла
//5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        third();
        forth();
    }

    public static void first () {
        //File file = new File("Test.txt");
        File file = new File("C:\\Users\\acer\\Desktop\\JavaCore_Lessons\\src\\by\\lessons\\lesson13\\Test2.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e) {
            System.out.println("что то пошло не так");
        }
    }

    public static void second () {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("C:\\Users\\acer\\Desktop\\JavaCore_Lessons\\src\\by\\lessons\\lesson13\\Test2.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("что то пошло не так");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }

    public static void third () {
       Farm farm1 = new Farm("рога и копыта", 10);
       Farm farm2 = new Farm("копыта и рога", 1);

        ArrayList farm = new ArrayList<>();
        farm.add(farm1);
        farm.add(farm2);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileSerialized"))) {
//            FileOutputStream fos = new FileOutputStream("FileSerialized");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(farm);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void forth () {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileSerialized"))){
//            FileInputStream fis = new FileInputStream("FileSerialized");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            //System.out.println(objectInputStream.readObject().toString());
            List<Farm> returnListFerma = (List<Farm>) objectInputStream.readObject();
            System.out.println(returnListFerma.get(0));
            System.out.println(returnListFerma.get(1));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }

    }


}
