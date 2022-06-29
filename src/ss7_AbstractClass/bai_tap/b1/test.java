package ss7_AbstractClass.bai_tap.b1;

import ss7_AbstractClass.bai_tap.b1.Circle;

public class test {
    public static void main(String[] args) {
        double x = Math.floor(Math.random()*10);
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-resize:");
        for (Circle circle: circles
             ) {
            System.out.println(circle);
        }
        System.out.println("After-resize: ");
        for (Circle circle:circles
             ) {
            circle.resize(x);
            System.out.println(circle);
        }
    }
}
