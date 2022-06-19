package ss3_mang.bai_tap;

import java.util.Scanner;
//[Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều
public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số lượng phần tử của cột: ");
        int col = sc.nextInt();
        int [][] table = new int[row][col];
        for (int i=0; i<table.length; i++) {
            for (int j=0; j<table[i].length; j++) {
                System.out.printf("table[%d][%d] = ",i,j);
                int value = sc.nextInt();
                table[i][j] = value;
            }
        }
        //in ra mảng
        System.out.println("Mảng : ");
        for (int[] value:
                table) {
            for (int vl:
                    value) {
                System.out.print(vl+"\t");
            }
            System.out.println();
        }
        int max = table[0][0];
        int toadox = 0;
        int toadoy = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(table[i][j] > max) {
                    max = table[i][j];
                    toadox = i;
                    toadoy = j;
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong mảng: %d ở vị trí hàng: %d, cột: %d ",max,toadox,toadoy);

    }
}
