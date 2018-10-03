import java.util.Scanner;
import java.lang.Math;

public class DienTichChuViHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        double radius = scanner.nextDouble();
        double area = radius*radius*Math.PI;
        double peri = radius*2*Math.PI;
        String areaS = String.format("%.2f", area);
        String periS = String.format("%.2f", peri);
        System.out.println("Diện tích hình tròn là: " + areaS);
        System.out.println("Chu vi hình tròn là " + periS);
    }
}
