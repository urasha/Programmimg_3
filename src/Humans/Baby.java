package Humans;

import Buzz.Buzz;

import java.util.HashMap;

public class Baby extends Character {
    private final HashMap<BuzzPower, String> powerToBuzzPhrase = new HashMap<>() {{
        put(BuzzPower.WEAK, String.format("%s услышал слабое жужжание\n", name));
        put(BuzzPower.STRONG, String.format("%s слышит более громкое жужжание\n", name));
    }};

    public Baby(String name) {
        super(name);
    }

    public void breathe() {
        System.out.printf("%s тяжело вздохнул\n", name);
    }

    public void listen(Buzz buzz) {
        if (buzz == null) {
            return;
        }

        System.out.printf(powerToBuzzPhrase.get(buzz.getBuzzPower()));
    }
}
