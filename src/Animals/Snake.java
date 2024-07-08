package animals;

public class Snake extends TerrestrialAnimal {
    public enum Poisonous {
        NON_VENOMOUS,
        VENOMOUS,
        HIGHLY_VENOMOUS
    }

    private Poisonous poisonous;
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
        super(name, gender, weight, 0, 20); // Default location for terrestrial animals
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

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + "m, Poisonous: " + poisonous;
    }

    @Override
    public void makeSound() {
        System.out.println("Snake " + getName() + " said ssssssss");
    }
}
