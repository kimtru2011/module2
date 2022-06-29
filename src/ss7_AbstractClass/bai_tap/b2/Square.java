package ss7_AbstractClass.bai_tap.b2;

public class Square extends Shape implements Colorable {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "a Square with side= "
                + getSide()
                +", which is a subclass of " +super.toString()
                +", Area = " + getArea();
    }
    double getArea() {
        return side*side;
    }

    @Override
    public String howToColor() {
        return "Color all four side..";
    }
}
