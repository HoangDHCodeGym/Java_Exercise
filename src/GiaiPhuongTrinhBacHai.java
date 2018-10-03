import java.util.Scanner;
import java.lang.Math;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a:");
        int a = scanner.nextInt();
        System.out.println("Nhập hệ số b:");
        int b = scanner.nextInt();
        System.out.println("Nhập hệ số c:");
        int c = scanner.nextInt();
        if (a == 0) {
            double result = -c/b;
            String resultS = String.format("%.2f",result);
            System.out.println("Nghiệm của phương trình là: " + resultS);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double result = -b / (2 * a);
                String resultS = String.format("%.2f",result);
                System.out.println("Phương trình có nghiệm kép là: " + resultS);
            } else {
                double result1 = (-b + Math.sqrt(delta)) / (2 * a);
                double result2 = (-b - Math.sqrt(delta)) / (2 * a);
                String result1S = String.format("%.2f",result1);
                String result2S = String.format("%.2f",result2);
                System.out.println("Phương trình có 2 nghiệm là: " + result1S + " và " + result2S);
            }
        }
    }
}
