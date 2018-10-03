import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phương trình bậc nhất dạng ax + b = 0");
        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double result = - (b / a);
            String resultS = String.format("%.2f", result);
            System.out.println("Nghiệm phương trình là: " + resultS);
        }
    }
}
