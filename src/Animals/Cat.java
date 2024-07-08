package animals;

import mobility.Point;

public class Cat extends TerrestrialAnimal {
    private String furColor;


    public Cat(String name, Gender gender, double weight, double speed, Point position, String furColor) {
        super(name, gender, weight, speed, position);
        this.furColor = furColor;
    }


    public String getFurColor() {
        return furColor;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " said Meow");
    }
}
