package animals;

public class Dolphin extends WaterAnimal {
    public enum WaterType {
        SEA, SWEET
    }

    private WaterType waterType; // Type of water the dolphin lives in


    public Dolphin(String name, Gender gender, double weight, double diveDepth, WaterType waterType) {
        super(name, gender, weight, diveDepth, new Point(50, 0)); // Default location for water animals
        this.waterType = waterType;
    }


    public WaterType getWaterType() {
        return waterType;
    }


    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Water Type: " + waterType.name();
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin " + getName() + " said Click-click");
    }
}
