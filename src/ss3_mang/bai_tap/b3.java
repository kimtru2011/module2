package ss3_mang.bai_tap;

import java.util.Scanner;
//[Bài tập] Gộp mảngAssignment
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int[4];
        int [] arr2 = new int[5];
        int [] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i<arr1.length; i++) {
            System.out.printf("Mảng 1: nhập phần tử thứ "+i+" : ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i<arr2.length; i++) {
            System.out.printf("Mảng 2: nhập phần tử thứ "+i+" : ");
            arr2[i] = sc.nextInt();
        }
        for (int i=0; i< arr1.length;i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i<arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.printf("Mảng 3 - gộp 2 mảng: ");
        for (int i =0; i<arr3.length; i++) {
            System.out.printf(arr3[i]+" ");
        }
    }
}
