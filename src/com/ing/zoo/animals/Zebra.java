package com.ing.zoo.animals;

/**
 * A Zebra which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Zebra extends Animal implements Herbivore {
    private String greeting = "zebra zebra";

    public Zebra(String name) {
        super(name);
    }

    public String eatLeaves() {
        return "munch munch zank yee bra";
    }

    // Getters and setters
    @Override
    public String getGreeting() {
        return greeting;
    }

    @Override
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}