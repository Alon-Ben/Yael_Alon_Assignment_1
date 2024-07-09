package System;

import Animals.*;
import Animals.Animal.Gender;
import Animals.Snake.Poisonous;
import Animals.Dolphin.WaterType;
import Mobility.Point;
import java.util.Scanner;

/**
 * Yael Berco, ID: 213435399
 * Alon Ben, ID: 313435399
 * Main system class for managing a collection of animals.
 * Allows user to create various types of animals and perform actions on them.
 */
public class Sys {
    /**
     * Main method to run the animal management system.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many animals do you want to create?");
        int numberOfAnimals = scanner.nextInt();
        Animal[] animals = new Animal[numberOfAnimals];

        // Create animals based on user input
        for (int i = 0; i < numberOfAnimals; i++) {
            System.out.println("Choose the type of animal (1: Terrestrial, 2: Water, 3: Air): ");
            int typeChoice = scanner.nextInt();

            switch (typeChoice) {
                case 1:
                    System.out.println("Choose the terrestrial animal (1: Dog, 2: Cat, 3: Snake): ");
                    int terrestrialChoice = scanner.nextInt();
                    animals[i] = createTerrestrialAnimal(terrestrialChoice, scanner);
                    break;
                case 2:
                    System.out.println("Choose the water animal (1: Alligator, 2: Whale, 3: Dolphin): ");
                    int waterChoice = scanner.nextInt();
                    animals[i] = createWaterAnimal(waterChoice, scanner);
                    break;
                case 3:
                    System.out.println("Choose the air animal (1: Eagle, 2: Pigeon): ");
                    int airChoice = scanner.nextInt();
                    animals[i] = createAirAnimal(airChoice, scanner);
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--; // decrement to retry this iteration
            }
        }

        // Main loop for performing actions on animals
        while (true) {
            System.out.println("Choose an action (1: Show all animals, 2: Make all animals speak, 3: Exit): ");
            int actionChoice = scanner.nextInt();

            switch (actionChoice) {
                case 1:
                    for (Animal animal : animals) {
                        System.out.println(animal.toString());
                    }
                    break;
                case 2:
                    for (Animal animal : animals) {
                        animal.makeSound();
                    }
                    break;
                case 3:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    /**
     * Creates a terrestrial animal based on user input.
     * @param choice The type of terrestrial animal to create.
     * @param scanner Scanner for user input.
     * @return The created terrestrial animal.
     */
    private static Animal createTerrestrialAnimal(int choice, Scanner scanner) {
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1: // Dog
                System.out.println("Enter dog's name, gender (MALE/FEMALE), weight, speed, breed, number of legs:");
                String dogName = scanner.nextLine();
                Gender dogGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                double dogWeight = scanner.nextDouble();
                double dogSpeed = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                String dogBreed = scanner.nextLine();
                int dogLegs = scanner.nextInt();
                return new Dog(dogName, dogGender, dogWeight, dogSpeed, dogBreed, dogLegs);
            case 2: // Cat
                System.out.println("Enter cat's name, gender (MALE/FEMALE), weight, speed, number of legs, castrated (true/false):");
                String catName = scanner.nextLine();
                Gender catGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                double catWeight = scanner.nextDouble();
                double catSpeed = scanner.nextDouble();
                int catLegs = scanner.nextInt();
                boolean isCastrated = scanner.nextBoolean();
                return new Cat(catName, catGender, catWeight, catSpeed, catLegs, isCastrated);
            case 3: // Snake
                System.out.println("Enter snake's name, gender (MALE/FEMALE), weight, length, poisonous (NON_VENOMOUS/VENOMOUS/HIGHLY_VENOMOUS):");
                String snakeName = scanner.nextLine();
                Gender snakeGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                double snakeWeight = scanner.nextDouble();
                double snakeLength = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                Poisonous poisonous = Poisonous.valueOf(scanner.nextLine().toUpperCase());
                return new Snake(snakeName, snakeGender, snakeWeight, snakeLength, poisonous);
            default:
                System.out.println("Invalid choice");
                return null;
        }
    }

    /**
     * Creates a water animal based on user input.
     * @param choice The type of water animal to create.
     * @param scanner Scanner for user input.
     * @return The created water animal.
     */
    private static Animal createWaterAnimal(int choice, Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.println("Enter name, gender (MALE/FEMALE), weight, speed, x position, y position, dive depth:");
        String name = scanner.nextLine();
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        double weight = scanner.nextDouble();
        double speed = scanner.nextDouble();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double diveDepth = scanner.nextDouble();
        Point position = new Point(x, y);

        switch (choice) {
            case 1: // Alligator
                System.out.println("Enter area of living:");
                scanner.nextLine(); // Consume newline
                String areaOfLiving = scanner.nextLine();
                return new Alligator(name, gender, weight, speed, position, diveDepth, areaOfLiving);
            case 2: // Whale
                System.out.println("Enter food type:");
                scanner.nextLine(); // Consume newline
                String foodType = scanner.nextLine();
                return new Whale(name, gender, weight, speed, position, diveDepth, foodType);
            case 3: // Dolphin
                System.out.println("Enter water type (SEA/SWEET):");
                WaterType waterType = WaterType.valueOf(scanner.next().toUpperCase());
                return new Dolphin(name, gender, weight, speed, position, diveDepth, waterType);
            default:
                System.out.println("Invalid choice");
                return null;
        }
    }

    /**
     * Creates an air animal based on user input.
     * @param choice The type of air animal to create.
     * @param scanner Scanner for user input.
     * @return The created air animal.
     */
    private static Animal createAirAnimal(int choice, Scanner scanner) {
        scanner.nextLine(); // Consume newline
        System.out.println("Enter name, gender (MALE/FEMALE), weight, speed, wingspan:");
        String name = scanner.nextLine();
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        double weight = scanner.nextDouble();
        double speed = scanner.nextDouble();
        double wingspan = scanner.nextDouble();

        switch (choice) {
            case 1: // Eagle
                System.out.println("Enter altitude of flight:");
                double altitudeOfFlight = scanner.nextDouble();
                return new Eagle(name, gender, weight, speed, wingspan, altitudeOfFlight);
            case 2: // Pigeon
                System.out.println("Enter family:");
                scanner.nextLine(); // Consume newline
                String family = scanner.nextLine();
                return new Pigeon(name, gender, weight, speed, wingspan, family);
            default:
                System.out.println("Invalid choice");
                return null;
        }
    }
}