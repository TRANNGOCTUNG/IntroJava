import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        // khai bao biến sử dụng;
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        // nhập dữ liệu từ bàn phím
        System.out.println("Your weight (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter): ");
        height = scanner.nextDouble();
        // tính theo chỉ số bmi;
        bmi = weight / Math.pow(height,2);
        // hiển thị số và kết quả;
        System.out.printf("%-20%s","bmi","Interpretation\n");
        if(bmi < 18) {
            System.out.printf("%-20.2f%s",bmi,"UnderWeight");
        } else if(bmi < 25.0) {
            System.out.printf("%-20.2f%s",bmi,"Normal");
        } else if(bmi < 30.0) {
            System.out.printf("%-20.2f%s",bmi,"OverWeight");
        } else {
            System.out.printf("%-20.2f%s",bmi,"Obese");
        }
    }
}
