package task_4_5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    @Override
    public String toString(){
        return ("Figure: [circle]; Radius["+radius+
                "]; Center: [" + center.toString() +"]");
    }
    @Override
    public void moveUp(){
        this.center.moveUp();
    }
    @Override
    public void moveDown(){
        this.center.moveDown();
    }
    @Override
    public void moveLeft(){
        this.center.moveLeft();
    }
    @Override
    public void moveRight(){this.center.moveRight();}
}
