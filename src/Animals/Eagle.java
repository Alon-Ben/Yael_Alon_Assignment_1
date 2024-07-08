package animals;

public class Eagle extends AirAnimal {
    private double altitudeOfFlight; // Altitude at which the eagle flies

    /**
     * Constructor for Eagle
     *
     * @param name             The name of the eagle
     * @param gender           The gender of the eagle
     * @param altitudeOfFlight The altitude at which the eagle flies
     */
    public Eagle(String name, Gender gender, double altitudeOfFlight) {
        super(name, gender, new Point(0, 100)); // Default location for air animals
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

    @Override
    public String toString() {
        return super.toString() + ", Altitude of Flight: " + altitudeOfFlight;
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle " + getName() + " said Clack-wack-chack");
    }
}
