package animals;

import mobility.Point;

public class Pigeon extends AirAnimal {
    private String family;

    public Pigeon(String name, Gender gender, double weight, double wingspan, String family) {
        super(name, gender, weight, new Point(0, 100), wingspan);
        this.family = family;
    }


    public String getFamily() {
        return family;
    }


    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return super.toString() + ", Family: " + family;
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon " + getName() + " said Arr-rar-rar-rar-raah");
    }
}
