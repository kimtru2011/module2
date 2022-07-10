package ss10_DSAStack.bai_tap;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//[Bài tập] Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map
public class b2 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {
            char charAt = str.toLowerCase().charAt(i);
            if(map.get(charAt) != null) {
                int count = map.get(charAt);
                map.put(charAt,++count);
            } else {
                map.put(charAt,1);
            }
        }
        System.out.println("Số lượng các ký tự có trong chuỗi: " +map);
    }
}
