package Mobility;

public interface ILocatable {

    public Point getLocation(); // returns the current location of the animal
    public boolean setLocation(Point location);// changes the location of the animal and returns true if successful, false otherwise
}
