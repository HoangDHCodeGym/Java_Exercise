import java.util.Scanner;
import java.text.DecimalFormat;

public class TinhDiemTrungBinh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Sinh:");
        double diemSinh = scanner.nextDouble();
        System.out.println("Nhập điểm Lý:");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa:");
        double diemHoa = scanner.nextDouble();
        double diemTB = (diemSinh + diemLy + diemHoa) / 3;
        double tongDiem = (diemSinh + diemLy + diemHoa);
        String diemTBS = String.format("%.2f", diemTB);
        System.out.println("Điểm trung bình"+ diemTBS);
        System.out.println("Tổng điểm" + tongDiem);
    }
}
