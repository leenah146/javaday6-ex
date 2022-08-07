public class MovablePoint implements Movable  {
    int x;
    int y;
    int xspeed;
    int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "("+x+","+y+",speed=("+xspeed+","+yspeed+")";
    }

    public void moveUp(){
        y-=yspeed;
    }
    public void moveDown(){
        y+=yspeed;
    }
    public void moveLeft(){
        x-=xspeed;
    }
    public void moveRight(){
        x+=xspeed;
    }

}
