package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents an Alligator, which is a type of WaterAnimal.
 * This class extends WaterAnimal and adds alligator-specific attributes and behaviors.
 */
public class Alligator extends WaterAnimal {
	/** The geographical area where the alligator lives */
	private String areaOfLiving;

	/**
	 * Constructs a new Alligator object.
	 *
	 * @param name         The name of the alligator
	 * @param gender       The gender of the alligator
	 * @param weight       The weight of the alligator
	 * @param speed        The speed of the alligator
	 * @param position     The initial position of the alligator
	 * @param diveDepth    The maximum dive depth of the alligator
	 * @param areaOfLiving The geographical area where the alligator lives
	 */
	public Alligator(String name, Gender gender, double weight, double speed, Point position, double diveDepth, String areaOfLiving) {
		super(name, gender, weight, speed, position, diveDepth);
		this.areaOfLiving = areaOfLiving;
	}

	/**
	 * Gets the area of living for the alligator.
	 *
	 * @return The geographical area where the alligator lives
	 */
	public String getAreaOfLiving() {
		return areaOfLiving;
	}

	/**
	 * Sets the area of living for the alligator.
	 *
	 * @param areaOfLiving The new geographical area where the alligator lives
	 */
	public void setAreaOfLiving(String areaOfLiving) {
		this.areaOfLiving = areaOfLiving;
	}

	/**
	 * Returns a string representation of the Alligator object.
	 *
	 * @return A string containing the alligator's details, including its area of living
	 */
	@Override
	public String toString() {
		return super.toString() + ", areaOfLiving: " + areaOfLiving;
	}

	/**
	 * Returns the sound made by the alligator.
	 *
	 * @return The string "Roar", representing the sound of an alligator
	 */
	@Override
	protected String getSound() {
		return "Roar";
	}
}
