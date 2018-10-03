import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ C:");
        double doC = scanner.nextDouble();
        double doF = doC * 1.8 + 32;
        String result = String.format("%.2f", doF);
        System.out.println("Độ F là:" + result);
    }
}
