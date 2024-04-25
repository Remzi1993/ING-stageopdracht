package com.ing.zoo;

public class Monkey extends Animal implements Omnivores, DoesTrick {
    private String greeting = "mhahhahahahaahaa";

    public Monkey(String name) {
        super(name);
    }

    @Override
    public String eatLeaves() {
        return "nomnomnom";
    }

    @Override
    public String eatMeat() {
        return "nomnomnom thx mate";
    }

    @Override
    public String performTrick() {
        return "Does a backflip";
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