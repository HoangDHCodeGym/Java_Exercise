import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ratio = 0;
        while ( !(ratio >= 1 && ratio <= 5) ) {
            System.out.println("Nhập số hệ số lương:");
            try {
                ratio = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập hệ số không đúng, vui lòng nhập lại");
            }
            if (ratio < 1 || ratio > 5) {
                System.out.println("Nhập hệ số trong khoảng từ 1 đến 5");
            }
        }

        int workingYear = 0;
        while (! (workingYear > 0) ) {
            System.out.println("Nhập số năm làm việc: ");
            try {
                workingYear = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập số năm không đúng, vui lòng nhập lại");
            }
            if (workingYear <= 0) {
                System.out.println("Nhập số năm không đúng, vui lòng nhập lại");
            }
        }

        int wage = Math.round(4000000 * ratio) + workingYear * 500000;
        String wageS = String.format("%,d", wage);
        System.out.println("Mức thu nhập là: " + wageS);
    }
}
