package Mobility;

/**
 * This interface defines the contract for objects that have a location.
 * Classes implementing this interface should be able to report their current location
 * and allow for location changes.
 */
public interface ILocatable {

    /**
     * Retrieves the current location of the object.
     *
     * @return A Point object representing the current location.
     */
    public Point getLocation(); // Returns the current location of the object

    /**
     * Attempts to change the location of the object.
     *
     * @param location The new location to set.
     * @return true if the location was successfully changed, false otherwise.
     */
    public boolean setLocation(Point location); // Changes the location and returns success status
}