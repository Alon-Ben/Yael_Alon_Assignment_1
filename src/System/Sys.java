package system;

import animals.*;
import mobility.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Sys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Input: number of animals
        System.out.print("Enter the number of animals you want to create: ");
        int numOfAnimals = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create animals based on user input
        for (int i = 0; i < numOfAnimals; i++) {
            System.out.println("Creating animal " + (i + 1) + ":");
            System.out.println("Choose the type of animal:");
            System.out.println("1. Terrestrial");
            System.out.println("2. Aquatic");
            System.out.println("3. Aerial");
            int typeChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (typeChoice) {
                case 1:
                    animals.add(createTerrestrialAnimal(scanner));
                    break;
                case 2:
                    animals.add(createAquaticAnimal(scanner));
                    break;
                case 3:
                    animals.add(createAerialAnimal(scanner));
                    break;
                default:
                    System.out.println("Invalid choice. Skipping animal creation.");
                    i--; // retry current index
                    break;
            }
        }

        // Main menu
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Display information of all animals");
            System.out.println("2. Make all animals sound");
            System.out.println("3. Exit");
            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (menuChoice) {
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
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static Animal createTerrestrialAnimal(Scanner scanner) {
        System.out.println("Choose the specific terrestrial animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Snake");
        int specificChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter gender (MALE, FEMALE, HERMAPHRODITE): ");
        String genderStr = scanner.nextLine();
        Animal.Gender gender = Animal.Gender.valueOf(genderStr.toUpperCase());
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter position (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Point position = new Point(x, y);

        switch (specificChoice) {
            case 1:
                System.out.print("Enter breed: ");
                String breed = scanner.next();
                System.out.print("Enter number of legs: ");
                int noLegs = scanner.nextInt();
                return new Dog(name, gender, weight, speed, position, breed, noLegs);
            case 2:
                System.out.print("Is the cat castrated (true/false): ");
                boolean castrated = scanner.nextBoolean();
                System.out.print("Enter number of legs: ");
                int catLegs = scanner.nextInt();
                return new Cat(name, gender, weight, speed, position, castrated, catLegs);
            case 3:
                System.out.print("Enter if the snake is poisonous (true/false): ");
                boolean poisonous = scanner.nextBoolean();
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                return new Snake(name, gender, weight, speed, position, poisonous, length);
            default:
                System.out.println("Invalid choice. Creating default Dog.");
                return new Dog(name, gender, weight, speed, position, "Unknown", 4);
        }
    }

    private static Animal createAquaticAnimal(Scanner scanner) {
        System.out.println("Choose the specific aquatic animal:");
        System.out.println("1. Alligator");
        System.out.println("2. Whale");
        System.out.println("3. Dolphin");
        int specificChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter gender (MALE, FEMALE, HERMAPHRODITE): ");
        String genderStr = scanner.nextLine();
        Animal.Gender gender = Animal.Gender.valueOf(genderStr.toUpperCase());
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter position (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Point position = new Point(x, y);

        switch (specificChoice) {
            case 1:
                System.out.print("Enter area of living: ");
                String areaOfLiving = scanner.next();
                return new Alligator(name, gender, weight, speed, position, areaOfLiving);
            case 2:
                System.out.print("Enter food type: ");
                String foodType = scanner.next();
                return new Whale(name, gender, weight, speed, position, foodType);
            case 3:
                System.out.print("Enter water type (SEA, SWEET): ");
                String waterTypeStr = scanner.next().toUpperCase();
                Dolphin.WaterType waterType = Dolphin.WaterType.valueOf(waterTypeStr);
                return new Dolphin(name, gender, weight, speed, position, waterType);
            default:
                System.out.println("Invalid choice. Creating default Alligator.");
                return new Alligator(name, gender, weight, speed, position, "Unknown");
        }
    }

    private static Animal createAerialAnimal(Scanner scanner) {
        System.out.println("Choose the specific aerial animal:");
        System.out.println("1. Eagle");
        System.out.println("2. Pigeon");
        int specificChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter gender (MALE, FEMALE, HERMAPHRODITE): ");
        String genderStr = scanner.nextLine();
        Animal.Gender gender = Animal.Gender.valueOf(genderStr.toUpperCase());
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter position (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Point position = new Point(x, y);

        switch (specificChoice) {
            case 1:
                System.out.print("Enter altitude of flight: ");
                double altitudeOfFlight = scanner.nextDouble();
                return new Eagle(name, gender, weight, speed, position, altitudeOfFlight);
            case 2:
                System.out.print("Enter family: ");
                String family = scanner.next();
                return new Pigeon(name, gender, weight, speed, position, family);
            default:
                System.out.println("Invalid choice. Creating default Eagle.");
                return new Eagle(name, gender, weight, speed, position, 500); // Default altitude
        }
    }
}
