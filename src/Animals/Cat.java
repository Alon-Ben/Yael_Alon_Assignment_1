package Animals;

import Animals.Animal.Gender;
import Mobility.Point;

/**
 * Represents a Cat, which is a type of TerrestrialAnimal.
 * This class extends TerrestrialAnimals and adds cat-specific attributes and behaviors.
 */
public class Cat extends TerrestrialAnimals {
	/** Indicates whether the cat is castrated or not */
	private boolean castrated;

	/**
	 * Constructs a new Cat object.
	 *
	 * @param name      The name of the cat
	 * @param gender    The gender of the cat
	 * @param weight    The weight of the cat
	 * @param speed     The speed of the cat
	 * @param noLegs    The number of legs the cat has
	 * @param castrated Whether the cat is castrated
	 */
	public Cat(String name, Gender gender, double weight, double speed, int noLegs, boolean castrated) {
		super(name, gender, weight, speed, noLegs);
		this.castrated = castrated;
	}

	/**
	 * Checks if the cat is castrated.
	 *
	 * @return true if the cat is castrated, false otherwise
	 */
	public boolean isCastrated() {
		return castrated;
	}

	/**
	 * Sets the castration status of the cat.
	 *
	 * @param castrated the new castration status
	 */
	public void setCastrated(boolean castrated) {
		this.castrated = castrated;
	}

	/**
	 * Returns a string representation of the Cat object.
	 *
	 * @return A string containing the cat's details, including castration status
	 */
	@Override
	public String toString() {
		return super.toString() + ", castrated: " + castrated;
	}

	/**
	 * Returns the sound made by the cat.
	 *
	 * @return The string "Meow"
	 */
	@Override
	protected String getSound() {
		return "Meow";
	}
}