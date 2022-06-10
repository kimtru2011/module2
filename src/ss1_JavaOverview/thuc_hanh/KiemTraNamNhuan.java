package thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("Năm %d là năm nhuần ", year);
                } else {
                    System.out.printf("Năm %d không phải nhuần ", year);
                }
            }
                else {
                    System.out.printf("Năm %d là năm nhuần ", year);
                }
        }
        else {
            System.out.printf("Năm %d không phải năm nhuần ", year);
        }
    }
}
