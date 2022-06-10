package thuc_hanh;

import java.util.Scanner;

public class Tinhchiso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chieucao, cannang,bmi;
        System.out.println("Nhập chiều cao: ");
        chieucao = scanner.nextDouble();
        System.out.println("Nhập cân nặng: ");
        cannang = scanner.nextDouble();
        bmi = cannang / Math.pow(chieucao,2);
        if(bmi<18.5) {
            System.out.printf("Chỉ số bmi: %f %s",bmi,"Underweight");
        } else if(bmi<25) {
            System.out.printf("Chỉ số bmi: %f %s",bmi,"Normal");
        } else if(bmi<30) {
            System.out.printf("Chỉ số bmt: %f %s",bmi, "Overweight");
        } else {
            System.out.printf("Chỉ số bmt: %f %s",bmi, "Obese");
        }
    }
}
