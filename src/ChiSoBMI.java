import java.util.Scanner;

public class ChiSoBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg):");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao (cm)");
        double height = scanner.nextDouble() / 100;
        double bmi = weight/Math.pow(height,2);
        double[] BMIRange = {30, 25, 18.5, 0};
        String[] Result = {"You are obese", "You are overweight", "You are normal", "You are underweight"};
        for (int i = 0; i < 4; i++) {
            if (bmi >= BMIRange[i]) {
                System.out.println(Result[i]);
                break;
            }
        }
    }
}
