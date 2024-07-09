package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents a Dog, extending the TerrestrialAnimals class.
 * This class adds breed as a specific characteristic of dogs.
 */
public class Dog extends TerrestrialAnimals {
    private String breed; // The breed of the dog

    /**
     * Constructs a Dog with the specified attributes.
     *
     * @param name   The name of the dog.
     * @param gender The gender of the dog.
     * @param weight The weight of the dog.
     * @param speed  The speed of the dog.
     * @param breed  The breed of the dog.
     * @param noLegs The number of legs the dog has.
     */
    public Dog(String name, Gender gender, double weight, double speed, String breed, int noLegs) {
        super(name, gender, weight, speed, noLegs); // Call the constructor of the superclass
        this.breed = breed;
    }

    /**
     * Returns the sound made by the dog.
     *
     * @return A string representation of the dog's sound ("Woof Woof").
     */
    @Override
    protected String getSound() {
        return "Woof Woof";
    }

    // Note: Getter and setter for breed could be added here if needed
}