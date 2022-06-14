package ss3_mang.thuc_hanh;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

//[Thực hành] Tìm giá trị trong mảng
public class b2 {
    public static void main(String[] args) {
        String[] students = {"Kim Tru", "Tien Anh", "Dang Khoa", "Viet Trieu"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " +i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
