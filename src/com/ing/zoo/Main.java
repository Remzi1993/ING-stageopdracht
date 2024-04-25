package com.ing.zoo;

import java.util.Scanner;

/**
 * Main class to run the zoo Java console application.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Main {
    // Creating all the animals with their names
    private static final Animal[] ANIMALS = {new Hippo("Elsa"), new Lion("Henk"), new Pig("Dora"),
            new Tiger("Wally"), new Zebra("Marty")};

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
                String[] parts = input.split(" ", 2);
                String animalName = parts.length > 1 ? parts[1] : "";

                if (animalName.isEmpty()) {
                    System.out.println("Unknown command: " + input);
                } else {
                    // Specific animal says hello
                    printAnimalGreeting(animalName);
                }

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
            if (animal instanceof Hippo) {
                System.out.println(animal.getName() + " eats leaves: " + ((Hippo) animal).eatLeaves());
            }

            if (animal instanceof Pig) {
                System.out.println(animal.getName() + " eats leaves: " + ((Pig) animal).eatLeaves());
            }

            if (animal instanceof Zebra) {
                System.out.println(animal.getName() + " eats leaves: " + ((Zebra) animal).eatLeaves());
            }
        }
    }

    private static void printCarnivoresEatingMeat() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Lion) {
                System.out.println(animal.getName() + " eats meat: " + ((Lion) animal).eatMeat());
            }

            if (animal instanceof Tiger) {
                System.out.println(animal.getName() + " eats meat: " + ((Tiger) animal).eatMeat());
            }
        }
    }

    private static void printTricks() {
        for (Animal animal : ANIMALS) {
            if (animal instanceof Pig) {
                System.out.println(animal.getName() + " performs trick: " + ((Pig) animal).performTrick());
            }

            if (animal instanceof Tiger) {
                System.out.println(animal.getName() + " performs trick: " + ((Tiger) animal).performTrick());
            }
        }
    }
}