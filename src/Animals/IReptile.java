package animals;

public interface IReptile {
    int MAX_SPEED = 5; // Maximum speed for reptiles

    /**
     * Increases the speed of the reptile.
     *
     * @param increment The amount to increase the speed by
     * @return True if the speed was successfully increased, false otherwise
     */
    boolean speedUp(int increment);
}
