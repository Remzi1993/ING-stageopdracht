package com.ing.zoo;

import com.ing.zoo.animals.*;

public class Zoo {
    private final Animal[] ANIMALS;

    public Zoo(Animal[] animals) {
        this.ANIMALS = animals;
    }

    public void userCommand(String input) {
        switch (input) {
            case "hello":
                printAllGreetings();
                break;
            case "give leaves":
                printHerbivoresEatingLeaves();
                break;
            case "give meat":
                printCarnivoresEatingMeat();
                break;
            case "perform trick":
                printTricks();
                break;
            default:
                // Splitting the user input to get an array of 2 strings to check for "hello" and the animal name
                String[] parts = input.split(" ", 2);
                String animalName = parts.length > 1 ? parts[1] : "";

                boolean isAnimalFound = false;
                // Check if the animal name is valid
                for (Animal animal : ANIMALS) {
                    if (animalName.equalsIgnoreCase(animal.getName())) {
                        animalName = animal.getName();
                        isAnimalFound = true;
                    }
                }

                // If the user input contains "hello" and the animal name, then print the animal greeting
                if (parts[0].equalsIgnoreCase("hello") && isAnimalFound) {
                    // Specific animal says hello
                    printAnimalGreeting(animalName);
                    break;
                }

                System.out.println("Unknown command: " + input);
                break;
        }
    }

    private void printAllGreetings() {
        for (Animal animal : ANIMALS) {
            System.out.println(animal.getName() + " says: " + animal.getGreeting());
        }
    }

    private void printAnimalGreeting(String animalName) {
        for (Animal animal : ANIMALS) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                System.out.println(animal.getName() + " says: " + animal.getGreeting());
                return;
            }
        }

        System.out.println("Unknown animal name: " + animalName);
    }

    private void printHerbivoresEatingLeaves() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Herbivore) {
                System.out.println(animal.getName() + " eats leaves: " + ((Herbivore) animal).eatLeaves());
            }
            if (animal instanceof Omnivores) {
                System.out.println(animal.getName() + " eats leaves: " + ((Omnivores) animal).eatLeaves());
            }
        }
    }

    private void printCarnivoresEatingMeat() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Carnivore) {
                System.out.println(animal.getName() + " eats meat: " + ((Carnivore) animal).eatMeat());
            }
            if (animal instanceof Omnivores) {
                System.out.println(animal.getName() + " eats meat: " + ((Omnivores) animal).eatMeat());
            }
        }
    }

    private void printTricks() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof DoesTrick) {
                System.out.println(animal.getName() + " performs trick: " + ((DoesTrick) animal).performTrick());
            }
        }
    }
}