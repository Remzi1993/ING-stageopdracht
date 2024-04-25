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

    @Override
    public String performTrick() {
        return "I am a Lion, I don't perform tricks";
    }

    @Override
    public String eatLeaves() {
        return "I'm a carnivore, I don't eat leaves";
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