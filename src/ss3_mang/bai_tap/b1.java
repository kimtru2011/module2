package ss3_mang.bai_tap;

import java.util.Scanner;

//[Bài tập] Xoá phần tử khỏi mảng
public class b1 {
    public static void main(String[] args) {
        int arr [] = {10,4,6,7,8,6,0,0,0,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int del = input.nextInt();
        for (int i=0; i< arr.length; i++) {
            if(arr[i] == del) {
                for (int j=i; j<arr.length; j++) {
                    if (j==arr.length-1) {
                        arr [j] = 0;
                        continue;
                    }
                    arr[j] = arr[j+1];
                }
            }
        }
        for (int value:
                arr) {
            System.out.println(value);
        }
    }
}
