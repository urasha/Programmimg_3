package Humans;

import Buzz.Buzz;

import java.util.HashMap;

public class Carlson extends Character implements Buzzable, Flyable {
    private final HashMap<Location, String> locationToFlyPhrase = new HashMap<>() {{
        put(Location.WINDOW, String.format("%s подлетел к окну\n", name));
        put(Location.ROOF, String.format("%s полетел дальше на крышу\n", name));
    }};

    private Buzz buzz;
    private boolean isTurboSpeed = false;

    public Carlson(String name) {
        super(name);
    }

    @Override
    public void startBuzzing() {
        buzz = new Buzz(BuzzPower.WEAK);
    }

    @Override
    public void flyTo(Location location) {
        if (isTurboSpeed) {
            System.out.printf("%s прибавил скорость\n", name);
        }

        System.out.printf(locationToFlyPhrase.get(location));
    }

    @Override
    public void flyAround() {
        System.out.printf("Набрав высоту, %s сделал небольшой круг над крышей, облетел вокруг трубы\n", name);
    }

    @Override
    public void changeSpeed() {
        isTurboSpeed = !isTurboSpeed;
    }

    @Override
    public void doRaces(int amount) {
        for (int i = 2; i <= amount + 1; i++) {
            System.out.printf("Он сделал %d-й круг\n", i);
        }
    }

    public Buzz getBuzz() {
        return buzz;
    }

    public void introduce() {
        System.out.print("Это толстый человечек, который живет на крыше\n");
    }

    public void lookAt(Character character) {
        System.out.printf("%s внимательно и долго посмотрел на %s\n", name, character.name);
    }
}
