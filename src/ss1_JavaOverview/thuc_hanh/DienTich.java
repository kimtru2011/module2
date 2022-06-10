package thuc_hanh;

import java.util.Scanner;

public class DienTich {
    public static void main(String[] args) {
        float ChieuDai;
        float ChieuRong;
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng scaner
        System.out.println("Nhập chiều dài: ");
        ChieuDai = scanner.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        ChieuRong = scanner.nextFloat();
        float DienTich = ChieuDai*ChieuRong;
        System.out.println("Diện tích hình chữ nhật: "+DienTich);
    }
}
