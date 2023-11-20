import Humans.Baby;
import Humans.BuzzPower;
import Humans.Carlson;
import Buzz.Buzz;
import Humans.Location;

public class Main {
    public static void main(String... args) {
        Baby baby = new Baby("Малыш");
        Carlson carlson = new Carlson("Карлсон");

        baby.breathe();

        carlson.startBuzzing();
        Buzz buzz = carlson.getBuzz();

        baby.listen(buzz);
        buzz.setBuzzPower(BuzzPower.STRONG);
        baby.listen(buzz);

        carlson.flyTo(Location.WINDOW);

        carlson.introduce();

        carlson.lookAt(baby);
        carlson.flyTo(Location.ROOF);
        carlson.flyAround();
        carlson.changeSpeed();
        carlson.flyTo(Location.WINDOW);
        carlson.doRaces(2);
    }
}
