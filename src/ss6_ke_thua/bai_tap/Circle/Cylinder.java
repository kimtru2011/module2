package ss6_ke_thua.bai_tap.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder() {

    }
    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return " Cylinder{" +
                " height= " + height + super.toString()+
                '}';
    }
}
