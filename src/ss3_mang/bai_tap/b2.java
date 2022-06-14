package ss3_mang.bai_tap;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        int [] arr = {10,4,6,7,8,0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần chèn: ");
        int x = input.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int vitri = input.nextInt();
        if (vitri<=1 && vitri>=arr.length-1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length-1; i>vitri; i--) {
                arr[i] = arr[i-1];
            }
            arr[vitri] = x;
            for (int value:
                 arr) {
                System.out.printf(" "+value);
            }
        }
    }
}
