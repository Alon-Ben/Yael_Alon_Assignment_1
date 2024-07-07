package Mobility;


public abstract class Mobile implements ILocatable{
    private Point Location; // current location
    private double totalDistance; // total distance the object traveled [>0]

    protected Mobile(Point location){
        this.Location = new Point(location);
        this.totalDistance = 0;
    }

    protected void addToalDistance(double distance){
        // increase distance
        this.totalDistance += distance;
    }
    protected double calcDistance(Point p){
        return Math.sqrt((p.getY() - getLocation().getY()) * (p.getY() - getLocation().getY()) + (p.getX() - getLocation().getX()) * (p.getX() - getLocation().getX()));
    }
}
