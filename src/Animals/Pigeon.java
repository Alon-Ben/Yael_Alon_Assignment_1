package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents a Pigeon, which is a type of AirAnimal.
 * This class extends AirAnimal and adds pigeon-specific attributes and behaviors.
 */
public class Pigeon extends AirAnimal {
    private String family; // The family or breed of the pigeon

    /**
     * Constructor for Pigeon
     *
     * @param name     The name of the pigeon
     * @param gender   The gender of the pigeon
     * @param weight   The weight of the pigeon
     * @param speed    The speed of the pigeon
     * @param wingspan The wingspan of the pigeon
     * @param family   The family or breed of the pigeon
     */
    public Pigeon(String name, Gender gender, double weight, double speed, double wingspan, String family) {
        super(name, gender, weight, speed, wingspan);
        this.family = family;
    }

    /**
     * Gets the family or breed of the pigeon
     *
     * @return The family or breed
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the family or breed of the pigeon
     *
     * @param family The family or breed to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Returns a string representation of the Pigeon object.
     *
     * @return A string containing the pigeon's details, including its family or breed
     */
    @Override
    public String toString() {
        return super.toString() + ", Family: " + family;
    }

    /**
     * Returns the sound made by the pigeon.
     *
     * @return The string "Arr-rar-rar-rar-raah", representing the sound of a pigeon
     */
    @Override
    protected String getSound() {
        return "Arr-rar-rar-rar-raah";
    }
}