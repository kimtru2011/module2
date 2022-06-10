package thuc_hanh;

import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();
        String dayMonth;
        switch (month) {
            case 2:  dayMonth = "28 or 29";
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dayMonth = "31";
            break;
            case 4:
            case 6:
            case 9:
            case 11: dayMonth = "30";
            break;
            default: dayMonth = "";
        }
        if (!dayMonth.equals(""))
            System.out.printf("Tháng '%d' có %s ngày", month, dayMonth);
        else
            System.out.printf("nhập sai số tháng");
    }
}