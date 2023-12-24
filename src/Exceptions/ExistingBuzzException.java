package Exceptions;

public class ExistingBuzzException extends Exception {
    private final String name;

    public ExistingBuzzException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "ОШИБКА: %s пытается создать Buzz, который уже существует!".formatted(name);
    }
}
