package Mobility;

/**
 * Represents a point in a 2D coordinate system with non-negative x and y coordinates.
 * This class may be considered for immutability in future implementations.
 */
public class Point {

    private int x, y; // x and y coordinates of the point

    /**
     * Constructs a Point with the given x and y coordinates.
     * If either coordinate is negative, the point is set to (-1, -1).
     *
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     */
    public Point(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }
        else {
            // Set to (-1, -1) to indicate an error
            // TODO: Consider throwing an IllegalArgumentException instead
            this.x = -1;
            this.y = -1;
        }
    }

    /**
     * Copy constructor for Point.
     *
     * @param p The Point to copy.
     */
    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     * Gets the x-coordinate of the point.
     *
     * @return The x-coordinate.
     */
    protected int getX() {
        return this.x;
    }

    /**
     * Gets the y-coordinate of the point.
     *
     * @return The y-coordinate.
     */
    protected int getY() {
        return this.y;
    }

    /**
     * Compares this Point with another object for equality.
     *
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        // Check if o is an instance of Point or not
        // "null instanceof [type]" also returns false
        if (!(o instanceof Point)) {
            return false;
        }

        // Typecast o to Point so that we can compare data members
        Point p = (Point) o;

        // Compare the data members and return accordingly
        return p.getX() == this.x && p.getY() == this.y;
    }
}