package by.lessons.lesson14;
import java.util.List;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<String> {

    @Override
    public String call() throws Exception {
        int result = numbers.stream().mapToInt(number -> number).sum();
        return String.valueOf(result);
    }

    private List <Integer> numbers;

    public NumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
