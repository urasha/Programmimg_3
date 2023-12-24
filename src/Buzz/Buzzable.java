package Buzz;

import Exceptions.ExistingBuzzException;

public interface Buzzable {
    void startBuzzing() throws ExistingBuzzException;
}
