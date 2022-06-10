package bai_tap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //Bước 1: Tạo dự án mới và khai báo hàm main()
        //
        //Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ giá có thể là 23000 VND/USD.
        //
        //Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.
        //
        //Bước 4: Tính giá trị VND và hiển thị ra màn hình.
        double VND = 23000;
        System.out.print("Nhập Dolar: ");
        Scanner scanner = new Scanner(System.in);
        double USD = scanner.nextDouble();
        double quydoi = USD * 23000;
        System.out.printf(" %1.1f dolar = %1.1f vnđ",USD,quydoi);
    }
}
