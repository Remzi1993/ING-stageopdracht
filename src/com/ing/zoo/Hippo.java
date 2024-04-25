package com.ing.zoo;

/**
 * A Hippo which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
    }

    public String eatLeaves() {
        return "munch munch lovely";
    }
}