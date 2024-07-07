package Mobility;

public class Point {
    final int x, y;

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

    public Point(Point location) {
        this.x = location.x;
        this.y = location.y;
    }

    protected int getX(){
        return this.x;
    }
    protected int getY(){
        return this.y;
    }


}
