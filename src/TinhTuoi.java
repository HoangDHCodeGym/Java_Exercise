import java.util.Scanner;
import java.util.Calendar;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm sinh:");
        int birthYear = scanner.nextInt();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int age = year - birthYear;
        System.out.println("Năm nay: " + age + " tuổi");
    }
}
