package by.lessons.lesson12.exception;

public class NotCorrectPasswordException extends RuntimeException {
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
