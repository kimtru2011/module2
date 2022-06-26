package ss3_mang.bai_tap;

import java.util.Scanner;

//[*Bài tập] Tính tổng các số ở một cột xác định
public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        int [][] arr;
        int value;
        arr = new int[row][col];
        for (int i=0; i< arr.length;i++) {
            for (int j=0; j<arr[i].length;j++) {
                System.out.printf("nhập số ở hàng %d, cột %d: ",i,j);
                value = sc.nextInt();
                arr[i][j] = value;
            }
        }
        int sum = 0;
        System.out.println("nhập cột xác định tính tổng: ");
        int inputcol = sc.nextInt();
        for (int i=0; i<arr[inputcol].length;i++) {
            sum = sum + arr[inputcol][i];
        }
        System.out.printf("tổng của cột %d: %d",inputcol,sum);
    }
}
