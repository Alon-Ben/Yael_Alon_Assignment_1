


/*package animals;

import mobility.Point;

public class AirAnimal extends Animal {
    private double wingspan;
    private double altitudeOfFlight;
    public static final double MAX_ALTITUDE = 1000;



    public AirAnimal(String name, Gender gender, double weight, double speed, Point position, double wingspan, double altitudeOfFlight) {
        super(name, gender, weight, speed, position);
        this.wingspan = wingspan;
        setAltitudeOfFlight(altitudeOfFlight); // use the setter to ensure validation
    }


    public double getWingspan() {
        return wingspan;
    }


    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }


    public double getAltitudeOfFlight() {
        return altitudeOfFlight;
    }


    public boolean setAltitudeOfFlight(double altitudeOfFlight) {
        if (altitudeOfFlight >= 0 && altitudeOfFlight <= MAX_ALTITUDE) {
            this.altitudeOfFlight = altitudeOfFlight;
            return true;
        } else {
            System.out.println("Altitude of flight must be between 0 and " + MAX_ALTITUDE);
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Wingspan: " + wingspan + ", Altitude of Flight: " + altitudeOfFlight;
    }

    @Override
    public void makeSound() {
        System.out.println("AirAnimal " + getName() + " said Clack-wack-chack");
    }
}
*/