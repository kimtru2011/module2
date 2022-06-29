package ss7_AbstractClass.bai_tap.b2;

public class test {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(2.5);
        squares[1] = new Square(3.0);
        System.out.println("Before ");
        for (Square s: squares
             ) {
            System.out.println(s);
        }
        System.out.println("After");
        for (Square s: squares
             ) {
            System.out.println(s.howToColor());
        }
    }
}
