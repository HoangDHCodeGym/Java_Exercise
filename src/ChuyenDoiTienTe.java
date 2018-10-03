import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiền USD:");
        double usd = scanner.nextDouble();
        final int exchangeRate = 23500;
        double vnd = usd * exchangeRate;
        System.out.println("Tiền VND là: " + vnd);
    }
}
