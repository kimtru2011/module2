package ss2_vonglap.bai_tap;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập n số nguyên tố đầu tiên: ");
        int number = scanner.nextInt();
        int count = 0;
        int x = 2;
        System.out.printf("%d số nguyên tố đầu tiên: \n",number);
        while (true) {
            if(isNgTo(x)) {
                System.out.printf(x+ " ");
                count ++;
            }
            if(count == number) {
                break;
            }
            x++;
        }
    }

    public static boolean isNgTo(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
