package thuc_hanh;

import java.util.Scanner;

public class PTbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.printf("pt có nghiệm: x = %1.3f",x);
        } else {
            if (b == c) {
                System.out.println("pt có vô số nghiệm");
            }
            else {
                System.out.println("pt vô nghiệm");
            }
        }
    }
}
