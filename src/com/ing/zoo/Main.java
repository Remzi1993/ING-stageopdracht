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

    // Creating all the animals with their names for the second zoo
    private static final Animal[] ANIMALS2 = {new Lion("Ramses"), new Pig("Jan"), new Tiger("Goofy")};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim().toLowerCase();

        // User command
        Zoo zoo = new Zoo(ANIMALS);
        zoo.userCommand(input);

        // User command for the second zoo
        System.out.print("\nVoer uw command in voor de tweede dierentuin: ");
        String input2 = scanner.nextLine().trim().toLowerCase();

        Zoo zoo2 = new Zoo(ANIMALS2);
        zoo2.userCommand(input2);
    }
}