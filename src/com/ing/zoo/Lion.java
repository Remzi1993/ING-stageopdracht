package com.ing.zoo;

/**
 * A Lion which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Lion extends Animal implements Carnivore {
    private String greeting = "roooaoaaaaar";

    public Lion(String name) {
        super(name);
    }

    public String eatMeat() {
        return "nomnomnom thx mate";
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