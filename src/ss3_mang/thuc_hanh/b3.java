package ss3_mang.thuc_hanh;

import java.util.Scanner;

//[Thực hành] Tìm giá trị lớn nhất trong mảng
public class b3 {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size>20)
                System.out.println("Size should not exceed 20");
        } while (size>20);
        //Nhập giá trị cho các phần tử của mảng
        arr = new int[size];
        int i =0;
        while (i<arr.length) {
            System.out.print("Enter element "+i+": ");
            arr[i] = sc.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
        System.out.print("Property list: ");
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }
        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = arr[0];
        int index = 0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j]>max) {
                max = arr[j];
                index = j;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
