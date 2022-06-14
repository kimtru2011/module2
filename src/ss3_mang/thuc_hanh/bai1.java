package ss3_mang.thuc_hanh;

import java.util.Scanner;

// [Thực hành] Đảo ngược các phần tử của mảng
public class bai1 {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhập kt bé hơn 20: ");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập giá trị phần tử "+i+" : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%s","các phần tử trong mảng: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array [j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%s", "mảng đảo: ", "");
        for (int j = 0; j< array.length; j++) {
            System.out.print(array[j]+ "\t");
        }
    }
}
