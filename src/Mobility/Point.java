package Mobility;

public class Point {
    int x, y;

    // important: perhaps I should make this class immutable?
    public Point(int x, int y){
        this.x = x;
        this.y = y;
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
    protected void setX(int x){
        this.x = x;
    }
    protected void setY(int y){
        this.y = y;
    }

}
