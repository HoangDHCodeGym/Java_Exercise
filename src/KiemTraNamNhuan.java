import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm bất kỳ: ");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println("Đây không phải năm nhuận");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Đây không phải năm nhuận");
        } else {
            System.out.println("Đây là năm nhuận");
        }
    }
}
