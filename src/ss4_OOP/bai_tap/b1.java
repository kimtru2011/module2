package ss4_OOP.bai_tap;

import java.util.Scanner;

//[Bài tập] Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
public class b1 {
    public static class QuadraticEquation {
        //Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3
        // hệ số
        private double a;
        private double b;
        private double c;
        public QuadraticEquation () {

        }
        //Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị
        // cho a, b và c.
        public QuadraticEquation (double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getDiscriminant() {
            double del = b*b - 4*a*c;
            return del;
        }
        public double getRoot1() {
            double Del = b*b - 4*a*c;
            double x1 = (-b+Math.pow((Del),0.5))/2*a;
            return x1;
        }
        public double getRoot2() {
            double Del = b*b - 4*a*c;
            double x2 = (-b-Math.pow((Del),0.5))/2*a;
            return x2;
        }
        public double getKep() {
            double x = -b/2*a;
            return x;
        }
        public String display() {
            return "pt bạn nhập: "+a+"x^2 + " +b+"x"+" + x = 0";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        System.out.println(ptb2.display());
        if (ptb2.getDiscriminant()>0) {
            System.out.printf("pt có 2 nghiệm phân biệt là : x1= %f; x2 =%f",ptb2.getRoot1(),ptb2.getRoot2());
        } else if (ptb2.getDiscriminant()==0) {
            System.out.printf("pt có nghiệm kép: x1 = x1 = %f ",ptb2.getKep());
        } else {
            System.out.println("pt vô nghiệm");
        }
    }
}
