package Animals;

import Mobility.Point;

/**
 * Abstract class representing a terrestrial animal, extending the Animal class.
 * This class adds the number of legs as a characteristic specific to land animals.
 */
public abstract class TerrestrialAnimals extends Animal {
    private int noLegs; // Number of legs the terrestrial animal has

    /**
     * Constructs a TerrestrialAnimal with the specified attributes.
     * The initial position is set to (0, 20) for all terrestrial animals.
     *
     * @param name   The name of the terrestrial animal.
     * @param gender The gender of the terrestrial animal.
     * @param weight The weight of the terrestrial animal.
     * @param speed  The speed of the terrestrial animal.
     * @param noLegs The number of legs of the terrestrial animal.
     */
    public TerrestrialAnimals(String name, Gender gender, double weight, double speed, int noLegs) {
        super(name, gender, weight, speed, new Point(0, 20)); // Set initial position to (0, 20)
        this.noLegs = noLegs;
    }

    /**
     * Gets the number of legs of the terrestrial animal.
     *
     * @return The number of legs.
     */
    public int getNoLegs() {
        return noLegs;
    }

    /**
     * Sets the number of legs of the terrestrial animal.
     *
     * @param noLegs The new number of legs to set.
     */
    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }

    /**
     * Compares this TerrestrialAnimal with another object for equality.
     *
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same object reference
        if (o == null || getClass() != o.getClass()) return false; // Null or different class
        if (!super.equals(o)) return false; // Check superclass equality
        TerrestrialAnimals that = (TerrestrialAnimals) o;
        return noLegs == that.noLegs; // Compare number of legs
    }

    /**
     * Returns a string representation of the TerrestrialAnimal.
     * This method overrides the toString method from the Animal class
     * to include the number of legs information.
     *
     * @return A string representation of the TerrestrialAnimal, including its number of legs.
     */
    @Override
    public String toString() {
        return "TerrestrialAnimal{" +
                "noLegs=" + noLegs +
                "} " + super.toString();
    }
}

