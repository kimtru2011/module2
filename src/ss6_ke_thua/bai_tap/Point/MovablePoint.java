package ss6_ke_thua.bai_tap.Point;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint() {

    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float [] getSpeed() {
        float [] arr = {getxSpeed(),getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return "(" +"x= " + getX()+
                ",y= "+ getY() +
                "), speed = "+
                "(xSpeed= " + xSpeed +
                ", ySpeed= " + ySpeed +
                ')';
    }
    public void move() {
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}
