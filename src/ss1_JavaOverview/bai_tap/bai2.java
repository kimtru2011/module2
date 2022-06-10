package bai_tap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str= "";
        switch (number) {
            case 0: str = "Zero";
                break;
            case 1: str = "One";
                break;
            case 2: str = "Two";
                break;
            case 3: str = "Three";
                break;
            case 4: str = "For";
                break;
            case 5: str = "Five";
                break;
            case 6: str = "Six";
                break;
            case 7: str = "Seven";
                break;
            case 8: str = "Eight";
                break;
            case 9: str = "Night";
                break;
            case 10: str = "Ten";
                break;

        }
        System.out.println("Đọc là: " +str);
    }
}