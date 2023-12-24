package Exceptions;

import Humans.Location;

public class WrongLocationException extends RuntimeException {
    private final Location locationName;
    private final String name;

    public WrongLocationException(String name, Location locationName){
        this.locationName = locationName;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "ОШИБКА: %s пытается облететь вокруг трубы в локации %s!".formatted(name, locationName);
    }
}
