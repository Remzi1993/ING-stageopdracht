package com.ing.zoo;

/**
 * A Hippo which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Hippo extends Animal implements Herbivore {
    public Hippo(String name) {
        super(name);
    }

    public String eatLeaves() {
        return "munch munch lovely";
    }

    @Override
    public String eatMeat() {
        return "I am a herbivore, I don't eat meat";
    }

    @Override
    public String performTrick() {
        return "I am a Hippo, I don't perform tricks";
    }
}