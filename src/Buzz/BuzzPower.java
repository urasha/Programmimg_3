package Buzz;

public enum BuzzPower {
    WEAK("слабое жужжание"),
    STRONG("громкое жужжание");

    public final String power;

    BuzzPower(String power) {
        this.power = power;
    }
}
