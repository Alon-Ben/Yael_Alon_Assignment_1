package animals;

public class Whale extends WaterAnimal {
    private String foodType; // Type of food the whale eats

    /**
     * Constructor for Whale
     *
     * @param name      The name of the whale
     * @param gender    The gender of the whale
     * @param weight    The weight of the whale
     * @param diveDepth The dive depth capability of the whale
     * @param foodType  The type of food the whale eats
     */
    public Whale(String name, Gender gender, double weight, double diveDepth, String foodType) {
        super(name, gender, weight, diveDepth, new Point(50, 0)); // Default location for water animals
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

    @Override
    public String toString() {
        return super.toString() + ", Food Type: " + foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Whale " + getName() + " said Splash");
    }
}
