package Animals;

import java.util.ArrayList;

import Graphics.IAnimal;
import Graphics.IClonable;
import Graphics.IDrawable;
import Graphics.IMoveable;
import Mobility.ILocatable;
import Mobility.Mobile;
import Olympics.Medal;
import Mobility.Point;

/**
 * Abstract class representing an animal.
 * Extends the Mobile class and provides basic properties and behaviors common to all animals.
 */
//public abstract class Animal extends Mobile implements ILocatable, IMoveable, IDrawable, IAnimal, IClonable {


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

//    private int size;
//    private int id;
//    private Location loc;
//    private Orientation orien;
//    private int maxEnergy;
//    private int energyPerMeter;
//    private CompetitionPanel pan;
//    private BufferedImage img1, img2, img3, img4;


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

    /**
     * Sets the speed of the animal.
     *
     * @param speed The new speed of the animal.
     * @return A boolean indicating whether the speed was successfully set.
     *         Returns {@code true} if the speed is set successfully, {@code false} otherwise.
     * @throws IllegalArgumentException If the speed is negative.
     */
    protected boolean setSpeed(double speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        try {
            this.speed = speed;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Gets the speed of the animal.
     *
     * @return The current speed of the animal.
     */
    protected double getSpeed() {
        return this.speed;
    }



}