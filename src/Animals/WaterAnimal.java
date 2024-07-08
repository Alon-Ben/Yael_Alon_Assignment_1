package animals;

import mobility.Point;

public class WaterAnimal extends Animal {
    private double diveDepth;
    public static final double MAX_DIVE = -800;


    public WaterAnimal(String name, Gender gender, double weight, double speed, Point position, double diveDepth) {
        super(name, gender, weight, speed, position);
        setDiveDepth(diveDepth); // use the setter to ensure validation
    }


    public double getDiveDepth() {
        return diveDepth;
    }


    public boolean setDiveDepth(double diveDepth) {
        if (diveDepth >= MAX_DIVE && diveDepth <= 0) {
            this.diveDepth = diveDepth;
            return true;
        } else {
            System.out.println("Dive depth must be between " + MAX_DIVE + " and 0");
            return false;
        }
    }

    public boolean dive(double depth) {
        return setDiveDepth(this.diveDepth + depth);
    }

    @Override
    public String toString() {
        return super.toString() + ", Dive Depth: " + diveDepth;
    }

    @Override
    public void makeSound() {
        System.out.println("WaterAnimal " + getName() + " made a sound specific to water animals");
    }
}
