package ss2_vonglap.thuc_hanh;

import java.util.Scanner;
//Mô tả
//Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
//
//Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay. Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
//
//Cách tính tiền lãi:
//
//Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể rút ra sau một khoảng thời gian nhất định người gửi tiền đã cam kết với ngân hàng. Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo tuần, tháng, quý, năm.
//
//Công thức:
//
//Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
public class laisuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang;
        int tiengui;
        double tilelaisuat;
        System.out.println("Nhập tiền gửi của bạn: ");
        tiengui = scanner.nextInt();
        System.out.println("nhập số tháng gửi: ");
        thang = scanner.nextInt();
        System.out.println("nhập tỉ lệ lãi suất: ");
        tilelaisuat = scanner.nextDouble();
        double tienlai = tiengui*(tilelaisuat/100)/12*thang;
        System.out.printf("tiền lãi của bạn: %1.1f",tienlai);
    }
}
