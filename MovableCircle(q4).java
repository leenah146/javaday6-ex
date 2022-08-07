public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed,int radius) {
     center=new MovablePoint(x,y,xspeed,yspeed);
     this.radius=radius;

    }
    @Override
    public String toString() {
        return "("+center.x+","+center.y+",speed=("+center.xspeed+","+center.yspeed+"),"+"radius=";
    }
    public void moveUp(){
        center.y-=center.yspeed;
    }
    public void moveDown(){
        center.y+=center.yspeed;
    }
    public void moveLeft(){
      center.x-=center.xspeed;
    }
    public void moveRight(){
       center.x+=center.xspeed;

    }

}
