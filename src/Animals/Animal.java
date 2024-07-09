package Animals;

import java.util.ArrayList;
import Mobility.Mobile;
import Olympics.Medal;
import Mobility.Point;

/**
 * Abstract class representing an animal.
 * Extends the Mobile class and provides basic properties and behaviors common to all animals.
 */
public abstract class Animal extends Mobile {

    /**
     * Enum representing the gender of the animal.
     */
    public enum Gender {MALE, FEMALE}

    private String name; // Name of the animal
    private Gender gender; // Gender of the animal
    private double weight; // Weight of the animal
    private double speed; // Speed of the animal
    private ArrayList<Medal> medals = new ArrayList<Medal>(); // List of medals won by the animal

    /**
     * Constructs an Animal with the specified attributes.
     *
     * @param name     The name of the animal.
     * @param gender   The gender of the animal.
     * @param weight   The weight of the animal.
     * @param speed    The speed of the animal.
     * @param position The initial position of the animal.
     */
    public Animal(String name, Gender gender, double weight, double speed, Point position) {
        super(position); // Call the constructor of the superclass (Mobile)
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
    }

    /**
     * Abstract method to get the sound made by the animal.
     * This method should be implemented by subclasses.
     *
     * @return A String representing the sound made by the animal.
     */
    protected abstract String getSound();

    /**
     * Makes the animal produce its sound.
     * Prints a message indicating the animal's type, name, and the sound it makes.
     */
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " " + name + " said " + getSound());
    }
}