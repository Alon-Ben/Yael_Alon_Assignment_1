package Animals;

import Animals.Animal.Gender;

/**
 * Represents an Eagle, which is a type of AirAnimal.
 * This class extends AirAnimal and adds eagle-specific attributes and behaviors.
 */
public class Eagle extends AirAnimal {
    private double altitudeOfFlight; // Altitude at which the eagle flies

    /**
     * Constructor for Eagle
     *
     * @param name             The name of the eagle
     * @param gender           The gender of the eagle
     * @param weight           The weight of the eagle
     * @param speed            The speed of the eagle
     * @param wingspan         The wingspan of the eagle
     * @param altitudeOfFlight The altitude at which the eagle flies
     */
    public Eagle(String name, Gender gender, double weight, double speed, double wingspan, double altitudeOfFlight) {
        super(name, gender, weight, speed, wingspan); // Default location for air animals
        this.altitudeOfFlight = altitudeOfFlight;
    }

    /**
     * Gets the altitude at which the eagle flies
     *
     * @return The altitude of flight
     */
    public double getAltitudeOfFlight() {
        return altitudeOfFlight;
    }

    /**
     * Sets the altitude at which the eagle flies
     *
     * @param altitudeOfFlight The altitude to set
     */
    public void setAltitudeOfFlight(double altitudeOfFlight) {
        this.altitudeOfFlight = altitudeOfFlight;
    }

    /**
     * Returns a string representation of the Eagle object.
     *
     * @return A string containing the eagle's details, including its altitude of flight
     */
    @Override
    public String toString() {
        return super.toString() + ", Altitude of Flight: " + altitudeOfFlight;
    }

    /**
     * Returns the sound made by the eagle.
     *
     * @return The string "Clack-wack-chack", representing the sound of an eagle
     */
    @Override
    protected String getSound() {
        return "Clack-wack-chack";
    }
}