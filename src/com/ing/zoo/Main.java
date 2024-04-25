package com.ing.zoo;

import com.ing.zoo.animals.*;
import java.util.Scanner;

/**
 * Main class to run the zoo Java console application.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Main {
    // Creating all the animals with their names
    private static final Animal[] ANIMALS = {new Hippo("Elsa"), new Lion("Henk"), new Pig("Dora"),
            new Tiger("Wally"), new Zebra("Marty"), new Rabbit("Lucy"), new Monkey("Milo")};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim().toLowerCase();

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
                // Splitting the input to get the animal name
                String[] parts = input.split(" ", 2);
                String animalName = parts.length > 1 ? parts[1] : "";

                boolean isAnimalFound = false;
                for (Animal animal : ANIMALS) {
                    if (animalName.equalsIgnoreCase(animal.getName())) {
                        animalName = animal.getName();
                        isAnimalFound = true;
                    }
                }

                if (isAnimalFound) {
                    // Specific animal says hello
                    printAnimalGreeting(animalName);
                    break;
                }

                System.out.println("Unknown command: " + input);
                break;
        }
    }

    private static void printAllGreetings() {
        for (Animal animal : ANIMALS) {
            System.out.println(animal.getName() + " says: " + animal.getGreeting());
        }
    }

    private static void printAnimalGreeting(String animalName) {
        for (Animal animal : ANIMALS) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                System.out.println(animal.getName() + " says: " + animal.getGreeting());
                return;
            }
        }

        System.out.println("Unknown animal name: " + animalName);
    }

    private static void printHerbivoresEatingLeaves() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Herbivore) {
                System.out.println(animal.getName() + " eats leaves: " + ((Herbivore) animal).eatLeaves());
            }
            if (animal instanceof Omnivores) {
                System.out.println(animal.getName() + " eats leaves: " + ((Omnivores) animal).eatLeaves());
            }
        }
    }

    private static void printCarnivoresEatingMeat() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Carnivore) {
                System.out.println(animal.getName() + " eats meat: " + ((Carnivore) animal).eatMeat());
            }
            if (animal instanceof Omnivores) {
                System.out.println(animal.getName() + " eats meat: " + ((Omnivores) animal).eatMeat());
            }
        }
    }

    private static void printTricks() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof DoesTrick) {
                System.out.println(animal.getName() + " performs trick: " + ((DoesTrick) animal).performTrick());
            }
        }
    }
}