package Animals;

import Mobility.Point;

/**
 * Abstract class representing a water animal, extending the Animal class.
 * This class adds dive depth as a characteristic specific to aquatic animals.
 */
public abstract class WaterAnimal extends Animal {
    private double diveDepth; // The current dive depth of the water animal
    public static final double MAX_DIVE = -800; // The maximum dive depth allowed (in negative meters)

    /**
     * Constructs a WaterAnimal with the specified attributes.
     *
     * @param name      The name of the water animal.
     * @param gender    The gender of the water animal.
     * @param weight    The weight of the water animal.
     * @param speed     The speed of the water animal.
     * @param position  The initial position of the water animal.
     * @param diveDepth The initial dive depth of the water animal.
     */
    public WaterAnimal(String name, Gender gender, double weight, double speed, Point position, double diveDepth) {
        super(name, gender, weight, speed, position);
        setDiveDepth(diveDepth); // Use the setter to ensure validation
    }

    /**
     * Gets the current dive depth of the water animal.
     *
     * @return The current dive depth.
     */
    public double getDiveDepth() {
        return diveDepth;
    }

    /**
     * Sets the dive depth of the water animal.
     * The depth must be between MAX_DIVE and 0.
     *
     * @param diveDepth The new dive depth to set.
     * @return true if the dive depth was successfully set, false otherwise.
     */
    public boolean setDiveDepth(double diveDepth) {
        if (diveDepth >= MAX_DIVE && diveDepth <= 0) {
            this.diveDepth = diveDepth;
            return true;
        } else {
            System.out.println("Dive depth must be between " + MAX_DIVE + " and 0");
            return false;
        }
    }

    /**
     * Changes the dive depth of the water animal by the specified amount.
     *
     * @param depth The change in depth (positive for diving deeper, negative for ascending).
     * @return true if the new depth was successfully set, false otherwise.
     */
    public boolean dive(double depth) {
        return setDiveDepth(this.diveDepth + depth);
    }

    /**
     * Returns a string representation of the WaterAnimal.
     * This method overrides the toString method from the Animal class
     * to include the dive depth information.
     *
     * @return A string representation of the WaterAnimal, including its dive depth.
     */
    @Override
    public String toString() {
        return super.toString() + ", Dive Depth: " + diveDepth;
    }
}
