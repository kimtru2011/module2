package ss3_mang.bai_tap;

import java.util.Scanner;

//[Bài tập] Tìm giá trị nhỏ nhất trong mảng
public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ",i);
            arr [i] = sc.nextInt();
        }
        System.out.println("Mảng: ");
        for (int value:
             arr) {
            System.out.printf(value+"\t");
        }
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr [i];
            }
        }
        System.out.println("\ngiá trị nhỏ nhất: "+min);
    }
}
