package Humans;

import Buzz.Buzz;

public class Baby extends Character {
    private static Baby instance;

    public static synchronized Baby getInstance() {
        if (instance == null) {
            instance = new Baby();
        }
        return instance;
    }

    private Baby() {
        name = "Малыш";
    }

    @Override
    public void lookAt(Character character) {
        System.out.printf("%s взглянул на %s\n", name, character.name);
    }

    public void breathe() {
        System.out.printf("%s тяжело вздохнул\n", name);
    }

    public void listen(Buzz buzz) {
        if (buzz == null) {
            return;
        }

        System.out.printf("%s услышал %s\n", name, buzz.getBuzzPower().power);
    }
}
