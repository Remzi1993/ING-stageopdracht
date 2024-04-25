package com.ing.zoo;

public class Rabbit extends Animal implements Herbivore, DoesTrick {
    private String greeting = "ppppurring";
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String eatLeaves() {
        return "thank you for the leaves";
    }

    @Override
    public String performTrick() {
        // Perform trick
        return "gives a high five";
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