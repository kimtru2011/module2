package ss6_ke_thua.bai_tap.Point;

public class test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,2,3,1.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
