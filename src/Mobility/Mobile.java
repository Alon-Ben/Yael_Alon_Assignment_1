package Mobility;

/**
 * An abstract class representing mobile objects that can move and track their location.
 * This class implements the ILocatable interface.
 */
public abstract class Mobile implements ILocatable {

    private Point location; // Current location of the mobile object
    private double totalDistance; // Total distance the object has traveled (always non-negative)

    /**
     * Constructs a Mobile object with a given initial location.
     *
     * @param loc The initial location of the mobile object.
     */
    protected Mobile(Point loc) {
        this.location = new Point(loc); // Create a new Point to avoid reference issues
        this.totalDistance = 0; // Initialize total distance to zero
    }

    /**
     * Adds the given distance to the total distance traveled.
     *
     * @param distance The distance to add.
     */
    private void addToalDistance(double distance) {
        this.totalDistance += distance; // Increase the total distance
    }

    /**
     * Calculates the distance between the current location and a given point.
     *
     * @param p The point to calculate the distance to.
     * @return The calculated distance.
     */
    protected double calcDistance(Point p) {
        // Calculate distance using the Pythagorean theorem
        return Math.sqrt((p.getY() - getLocation().getY()) * (p.getY() - getLocation().getY()) +
                (p.getX() - getLocation().getX()) * (p.getX() - getLocation().getX()));
    }

    /**
     * Moves the object to a new location and updates the total distance traveled.
     *
     * @param p The new location to move to.
     * @return The distance moved.
     */
    protected double Move(Point p) {
        if (this.location.equals(p)) { return 0; } // No movement if same location
        double distance = calcDistance(p);
        addToalDistance(distance);
        setLocation(p);
        return distance;
    }

    /**
     * Gets the current location of the mobile object.
     *
     * @return The current location.
     */
    @Override
    public Point getLocation() {
        return this.location;
    }

    /**
     * Sets a new location for the mobile object.
     *
     * @param location The new location to set.
     * @return true if the location was successfully set, false otherwise.
     */
    @Override
    public boolean setLocation(Point location) {
        if (location != null) {
            this.location = new Point(location); // Create a new Point to avoid reference issues
            return true;
        }
        return false; // Return false if the provided location is null
    }
}