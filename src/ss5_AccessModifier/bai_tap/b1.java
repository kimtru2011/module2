package ss5_AccessModifier.bai_tap;

public class b1 {
    public static class Circle{
        private double radius = 1.0;
        private String color = "red";
        public Circle() {

        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            return Math.PI*this.radius*this.radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius()+" " +circle.getArea());
        circle.setRadius(5);
        System.out.println(circle.getRadius()+" "+circle.getArea());
    }
}
