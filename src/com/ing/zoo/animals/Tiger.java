package com.ing.zoo.animals;

import java.util.Random;

/**
 * A Tiger which extends Animal.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Tiger extends Animal implements Carnivore, DoesTrick {
    private String greeting = "rraaarww";

    public Tiger(String name) {
        super(name);
    }

    public String eatMeat() {
        return "nomnomnom oink wubalubadubdub";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);

        String trick;
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }

        return trick;
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