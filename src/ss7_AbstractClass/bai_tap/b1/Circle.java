package ss7_AbstractClass.bai_tap.b1;

public class Circle extends Shape implements Resizeable {
        private double radius = 1.0;
        public Circle() {

        }
        public Circle(double radius) {
        this.radius = radius;
        }
        public Circle(double radius, String color,boolean filled ) {
            super(color, filled);
            this.radius = radius;
        }
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI*radius*radius;
        }
        public double getPerimeter() {
            return Math.PI*radius*2;
        }

        @Override
        public String toString() {
            return "A Circler with radius= "
                    + getRadius()
                    +", which is a subclass of "
                    + super.toString();
        }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + percent;
    }
}
