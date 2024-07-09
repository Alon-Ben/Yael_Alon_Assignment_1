package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents a Dolphin, which is a type of WaterAnimal.
 * This class extends WaterAnimal and adds dolphin-specific attributes and behaviors.
 */
public class Dolphin extends WaterAnimal {
    /**
     * Enum representing the type of water the dolphin lives in.
     */
    public enum WaterType {
        SEA, SWEET
    }

    private WaterType waterType; // Type of water the dolphin lives in

    /**
     * Constructor for Dolphin
     *
     * @param name      The name of the dolphin
     * @param gender    The gender of the dolphin
     * @param weight    The weight of the dolphin
     * @param speed     The speed of the dolphin
     * @param position  The initial position of the dolphin
     * @param diveDepth The dive depth capability of the dolphin
     * @param waterType The type of water the dolphin lives in
     */
    public Dolphin(String name, Gender gender, double weight, double speed, Point position, double diveDepth, WaterType waterType) {
        super(name, gender, weight, speed, position, diveDepth);
        this.waterType = waterType;
    }

    /**
     * Gets the type of water the dolphin lives in
     *
     * @return The water type (SEA or SWEET)
     */
    public WaterType getWaterType() {
        return waterType;
    }

    /**
     * Sets the type of water the dolphin lives in
     *
     * @param waterType The water type to set (SEA or SWEET)
     */
    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    /**
     * Returns a string representation of the Dolphin object.
     *
     * @return A string containing the dolphin's details, including its water type
     */
    @Override
    public String toString() {
        return super.toString() + ", Water Type: " + waterType.name();
    }

    /**
     * Returns the sound made by the dolphin.
     *
     * @return The string "Click-click", representing the sound of a dolphin
     */
    @Override
    protected String getSound() {
        return "Click-click";
    }
}