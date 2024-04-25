package com.ing.zoo.animals;

import java.util.Random;

/**
 * A Pig which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Pig extends Animal implements Omnivores, DoesTrick {
    public Pig(String name) {
        super(name);
    }

    public String eatLeaves() {
        return "munch munch oink";
    }

    public String eatMeat() {
        return "nomnomnom oink thx";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);

        String trick;
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }

        return trick;
    }
}