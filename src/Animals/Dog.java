package animals;

import mobility.Point;

public class Dog extends TerrestrialAnimal{
    private string breed;

    public Dog(String name, Gender gender, double weight, double speed, Point position, String breed, int noLegs) {
        super(name, gender, weight, speed, position, noLegs);
        this.breed = breed;
    }
    protected String getSound(){
        return "Woof Woof";
    };


}

