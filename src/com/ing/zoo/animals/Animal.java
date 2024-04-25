package com.ing.zoo.animals;

/**
 * Abstract class for all animals.
 * This shows my skills in OOP, inheritance and polymorphism.
 * Also, using an abstract class to define common properties and methods saves time and code.
 *
 * @author Remzi Cavdar - ict@remzi.info
 */
public abstract class Animal {
    protected String name;
    // Default greeting because 2 animals have the same greeting: Hippo and Pig
    protected String greeting = "splash";

    public Animal(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}