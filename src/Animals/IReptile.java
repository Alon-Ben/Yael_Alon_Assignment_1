package Animals;

/**
 * The IReptile interface defines the common characteristics and behaviors for reptile animals.
 * It includes a constant for maximum speed and a method for increasing speed.
 */
public interface IReptile {
    /** Maximum speed for reptiles in units per time (e.g., km/h) */
    static final int MAX_SPEED = 5;

    /**
     * Increases the speed of the reptile.
     * The implementation should ensure that the speed does not exceed MAX_SPEED.
     *
     * @param increment The amount to increase the speed by
     * @return True if the speed was successfully increased, false otherwise
     *         (e.g., if the resulting speed would exceed MAX_SPEED)
     */
    boolean speedUp(int increment);
}

