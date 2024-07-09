package Animals;
import Mobility.Point;

/**
 * Abstract class representing an air animal, extending the Animal class.
 * This class adds wingspan as a characteristic specific to flying animals.
 */
public abstract class AirAnimal extends Animal {
    private double wingspan; // The wingspan of the air animal

    /**
     * Constructs an AirAnimal with the specified attributes.
     * The initial position is set to (0, 100) for all air animals.
     *
     * @param name     The name of the air animal.
     * @param gender   The gender of the air animal.
     * @param weight   The weight of the air animal.
     * @param speed    The speed of the air animal.
     * @param wingspan The wingspan of the air animal.
     */
    public AirAnimal(String name, Gender gender, double weight, double speed, double wingspan) {
        super(name, gender, weight, speed, new Point(0, 100)); // Set initial position to (0, 100)
        this.wingspan = wingspan;
    }

    /**
     * Gets the wingspan of the air animal.
     *
     * @return The wingspan of the air animal.
     */
    public double getWingspan() {
        return wingspan;
    }

    /**
     * Sets the wingspan of the air animal.
     *
     * @param wingspan The new wingspan to set.
     */
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    /**
     * Returns a string representation of the AirAnimal.
     * This method overrides the toString method from the Animal class
     * to include the wingspan information.
     *
     * @return A string representation of the AirAnimal, including its wingspan.
     */
    @Override
    public String toString() {
        return super.toString() + ", Wingspan: " + wingspan;
    }
}
