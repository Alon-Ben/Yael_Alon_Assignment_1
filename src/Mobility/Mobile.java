package Mobility;


public abstract class Mobile implements ILocatable{

    private Point location; // current location
    private double totalDistance; // total distance the object traveled [>0]

    protected Mobile(Point loc){
        this.location = new Point(loc);
        this.totalDistance = 0;
    }

    private void addToalDistance(double distance){
        // increase distance
        this.totalDistance += distance;
    }
    protected double calcDistance(Point p){
        return Math.sqrt((p.getY() - getLocation().getY()) * (p.getY() - getLocation().getY()) + (p.getX() - getLocation().getX()) * (p.getX() - getLocation().getX()));
    }

    protected double Move(Point p){
        if(this.location.equals(p)){return 0;}
        double distance = calcDistance(p);
        addToalDistance(distance);
        setLocation(p);
        return distance;
    }

    @Override
    public Point getLocation(){
        return this.location;
    }


    @Override
    public boolean setLocation(Point location){
        if(location!=null){
            this.location = new Point(location);
            return true;
        }
        return false;
    }

}
