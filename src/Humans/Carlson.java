package Humans;

import Buzz.Buzz;
import Buzz.Buzzable;
import Buzz.BuzzPower;

public class Carlson extends Character implements Buzzable, Flyable {
    private static Carlson instance;

    private Buzz buzz;
    private boolean isTurboSpeed = false;

    public static synchronized Carlson getInstance() {
        if (instance == null) {
            instance = new Carlson();
        }
        return instance;
    }

    private Carlson() {
        name = "Карлсон";
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

        System.out.printf("Карлсон подлетел к %s\n", location.currentLocation);
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

    @Override
    public void lookAt(Character character) {
        System.out.printf("%s внимательно и долго посмотрел на %s\n", name, character.name);
    }
}
