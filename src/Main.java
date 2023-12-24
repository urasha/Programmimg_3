import Exceptions.ExistingBuzzException;
import Exceptions.WrongLocationException;
import Humans.Baby;
import Buzz.BuzzPower;
import Humans.Carlson;
import Buzz.Buzz;
import Humans.Location;

public class Main {
    public static void main(String... args) {
        Baby baby = Baby.getInstance();
        Carlson carlson = Carlson.getInstance();
        Buzz buzz;

        baby.breathe();

        try {
            carlson.startBuzzing();
        } catch (ExistingBuzzException exception) {
            System.out.println(exception.getMessage());
        }

        buzz = carlson.getBuzz();

        baby.listen(buzz);

        buzz.setBuzzPower(BuzzPower.STRONG);
        baby.listen(buzz);

        carlson.flyTo(Location.WINDOW);

        carlson.introduce();

        carlson.lookAt(baby);
        carlson.flyTo(Location.ROOF); // change to WINDOW = !WrongLocationException!

        try {
            carlson.flyAround();
        } catch (WrongLocationException exception) {
            System.out.println(exception.getMessage());
        }

        carlson.changeSpeed();
        carlson.flyTo(Location.WINDOW);
        carlson.doRaces(2);
    }
}
