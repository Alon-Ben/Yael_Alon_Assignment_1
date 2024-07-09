package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents a Whale, which is a type of WaterAnimal.
 * This class extends WaterAnimal and adds whale-specific attributes and behaviors.
 *
 * @author zvika
 */
public class Whale extends WaterAnimal {
    private String foodType; // Type of food the whale eats

    /**
     * Constructor for Whale
     *
     * @param name      The name of the whale
     * @param gender    The gender of the whale
     * @param weight    The weight of the whale
     * @param speed     The speed of the whale
     * @param position  The initial position of the whale
     * @param diveDepth The dive depth capability of the whale
     * @param foodType  The type of food the whale eats
     */
    public Whale(String name, Gender gender, double weight, double speed, Point position, double diveDepth, String foodType) {
        super(name, gender, weight, speed, position, diveDepth);
        this.foodType = foodType;
    }

    /**
     * Gets the type of food the whale eats
     *
     * @return The type of food
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Sets the type of food the whale eats
     *
     * @param foodType The type of food to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    /**
     * Returns a string representation of the Whale object.
     *
     * @return A string containing the whale's details, including its food type
     */
    @Override
    public String toString() {
        return super.toString() + ", Food Type: " + foodType;
    }

    /**
     * Returns the sound made by the whale.
     *
     * @return The string "Splash", representing the sound of a whale
     */
    @Override
    protected String getSound() {
        return "Splash";
    }
}