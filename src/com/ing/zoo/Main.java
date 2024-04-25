package com.ing.zoo;

import java.util.Scanner;

/**
 * Main class to run the zoo Java console application.
 * @author Remzi Cavdar - ict@remzi.info
 */
public class Main {
    public static void main(String[] args) {
        // Creating all the animals with their names
        String[] animalsNames = {"Elsa", "Henk", "Dora", "Wally", "Marty"};
        Hippo elsa = new Hippo(animalsNames[0]);
        Lion henk = new Lion(animalsNames[1]);
        Pig dora = new Pig(animalsNames[2]);
        Tiger wally = new Tiger(animalsNames[3]);
        Zebra marty = new Zebra(animalsNames[4]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        // Assuming command followed by an optional animal name separated by a space
        String[] parts = input.split(" ", 2);
        // Convert command and animal to a lower case for consistent handling
        String command = parts[0].toLowerCase();
        String animalName = parts.length > 1 ? parts[1].toLowerCase() : "";

        switch (command) {
            case "hello":
                if (animalName.isEmpty()) {
                    // All animals say hello
                    System.out.println(elsa.getName() + " says: " + elsa.getGreeting());
                    System.out.println(henk.getName() + " says: " + henk.getGreeting());
                    System.out.println(dora.getName() + " says: " + dora.getGreeting());
                    System.out.println(wally.getName() + " says: " + wally.getGreeting());
                    System.out.println(marty.getName() + " says: " + marty.getGreeting());
                }
                else {
                    // Specific animal says hello
                    switch (animalName) {
                        case "elsa":
                            System.out.println(elsa.getName() + " says: " + elsa.getGreeting());
                            break;
                        case "henk":
                            System.out.println(henk.getName() + " says: " + henk.getGreeting());
                            break;
                        case "dora":
                            System.out.println(dora.getName() + " says: " + dora.getGreeting());
                            break;
                        case "wally":
                            System.out.println(wally.getName() + " says: " + wally.getGreeting());
                            break;
                        case "marty":
                            System.out.println(marty.getName() + " says: " + marty.getGreeting());
                            break;
                        default:
                            System.out.println("Unknown animal name: " + animalName);
                            break;
                    }
                }
                break;
            case "give leaves":
                // All herbivores eat leaves
                System.out.println(elsa.getName() + " eats leaves: " + elsa.eatLeaves());
                System.out.println(dora.getName() + " eats leaves: " + dora.eatLeaves());
                System.out.println(marty.getName() + " eats leaves: " + marty.getGreeting());
                break;
            case "give meat":
                // All carnivores eat meat
                System.out.println(henk.getName() + " eats meat: " + henk.getGreeting());
                System.out.println(dora.getName() + " eats meat: " + dora.eatLeaves());
                System.out.println(wally.getName() + " eats meat: " + wally.getGreeting());
                break;
            case "perform trick":
                // Animals that can perform tricks do so
                System.out.println(dora.getName() + " performs trick: " + dora.performTrick());
                System.out.println(wally.getName() + " performs trick: " + wally.performTrick());
                break;
            default:
                System.out.println("Unknown command: " + input);
                break;
        }
    }
}