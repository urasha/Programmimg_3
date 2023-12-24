package Humans;

import Exceptions.WrongLocationException;

interface Flyable {
    void flyTo(Location location);
    void flyAround() throws WrongLocationException;
    void changeSpeed();
    void doRaces(int amount);
}
