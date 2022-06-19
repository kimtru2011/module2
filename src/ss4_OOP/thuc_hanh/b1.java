package ss4_OOP.thuc_hanh;

import java.util.Scanner;

//[Thực hành] Lớp hình chữ nhật
public class b1 {
    //Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties),
    // định nghĩa các phương thức khởi tạo (contructors).
    public static class Rectangle {
        double width, height;
        public Rectangle() {

        }
        public Rectangle (double width, double height) {
            this.width = width;
            this.height = height;
        }
        //Bước 2: Định nghĩa các phương thức getArea(), getPerimeter(), display()
        public double getArea() {
            return this.width * this.height;
        }
        public double getPerimeter() {
            return (this.width + this.height)*2;
        }
        public String display() {
            return "Rectangle {" +"width = "+width+", height= "+ height +" }";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextInt();
        System.out.print("Nhập chiều dài: ");
        double height = sc.nextInt();
        //Bước 5: Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức
        // khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Chu vi hình chữ nhật: "+rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " +rectangle.getArea());
    }
}
