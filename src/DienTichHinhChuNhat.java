import java.util.Scanner;
public class DienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao hình chữ nhật:");
        float height = scanner.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật:");
        float width = scanner.nextFloat();
        float area = height * width;
        System.out.println("Diện tích hình chữ nhật: " +  area);
    }
}
