package Animals;

/**
 * Represents a Snake, which is a type of TerrestrialAnimal.
 * This class extends TerrestrialAnimals and adds snake-specific attributes and behaviors.
 */
public class Snake extends TerrestrialAnimals implements IReptile {
    /**
     * Increases the speed of the reptile.
     * The implementation should ensure that the speed does not exceed MAX_SPEED.
     *
     * @param increment The amount to increase the speed by
     * @return True if the speed was successfully increased, false otherwise
     * (e.g., if the resulting speed would exceed MAX_SPEED)
     */
    @Override
    public boolean speedUp(int increment) {
        if (this.getSpeed() + increment <= MAX_SPEED ) {
            return this.setSpeed(this.getSpeed() + increment);
        }
        return false;
    }

    /**
     * Enum representing the venomous status of the snake.
     */
//    public enum Poisonous {
//        NON_VENOMOUS,
//        VENOMOUS,
//        HIGHLY_VENOMOUS
//    }
// second assignment orders:
    public enum Poisonous {
        Low {
            @Override
            public String toString() {
                return "Low";
            }
        },
        Mid {
            @Override
            public String toString() {
                return "Mid";
            }
        },
        High {
            @Override
            public String toString() {
                return "High";
            }
        },
        Yes {
            @Override
            public String toString() {
                return "Yes";
            }
        },
        No {
            @Override
            public String toString() {
                return "No";
            }
        }
    }

    private Poisonous poisonous; // The venomous status of the snake
    private double length; // Length of the snake in meters

    /**
     * Constructor for Snake
     *
     * @param name       The name of the snake
     * @param gender     The gender of the snake
     * @param weight     The weight of the snake
     * @param length     The length of the snake in meters
     * @param poisonous  The poisonous level of the snake
     */
    public Snake(String name, Gender gender, double weight, double length, Poisonous poisonous) {
        super(name, gender, weight, 0, 0); // Default location for terrestrial animals, 0 speed, 0 legs because it's a snake god took his legs (or placeholder)
        this.length = length;
        this.poisonous = poisonous;
    }

    /**
     * Gets the length of the snake
     *
     * @return The length in meters
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the snake
     *
     * @param length The length to set in meters
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Gets the poisonous level of the snake
     *
     * @return The poisonous level
     */
    public Poisonous getPoisonous() {
        return poisonous;
    }

    /**
     * Sets the poisonous level of the snake
     *
     * @param poisonous The poisonous level to set
     */
    public void setPoisonous(Poisonous poisonous) {
        this.poisonous = poisonous;
    }

    /**
     * Returns a string representation of the Snake object.
     *
     * @return A string containing the snake's details, including length and venomous status
     */
    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + "m, Poisonous: " + poisonous;
    }

    /**
     * Returns the sound made by the snake.
     *
     * @return The string representing the hissing sound of a snake
     */
    @Override
    protected String getSound() {
        return "ssssssss";
    }
}