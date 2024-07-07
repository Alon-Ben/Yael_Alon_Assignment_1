package Mobility;

public class Point {

    private int x, y;

    // important: perhaps I should make this class immutable?
    public Point(int x, int y){
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }
        else { //to know that there was an error in initializing the point BUT!!! it probably should throw an exception!
            this.x = -1;
            this.y = -1;
        }
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }


    protected int getX(){
        return this.x;
    }
    protected int getY(){
        return this.y;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Point or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Point)) {
            return false;
        }

        // typecast o to Point so that we can compare data members
        Point p = (Point)o;

        // Compare the data members and return accordingly
        return p.getX() == this.x && p.getY() == this.y;
    }
}

