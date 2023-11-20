package Buzz;

import Humans.BuzzPower;

import java.util.Objects;

public class Buzz {
    private BuzzPower buzzPower;

    public Buzz(BuzzPower power) {
        buzzPower = power;
    }

    public void setBuzzPower(BuzzPower power) {
        buzzPower = power;
    }

    public BuzzPower getBuzzPower() {
        return buzzPower;
    }

    @Override
    public String toString() {
        return "Buzz{" +
                "buzzPower=" + buzzPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buzz buzz = (Buzz) o;
        return buzzPower == buzz.buzzPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buzzPower);
    }
}
