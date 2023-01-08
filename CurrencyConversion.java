import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USA ;
        double vnd;
        Scanner input  = new Scanner(System.in);
        System.out.print("Input USA");
        USA = input.nextDouble();

        System.out.print("Input VND");
        vnd = input.nextDouble();

        double exchange = USA * VND;
        System.out.println(USA + " $ " + " = " + exchange + " VND ");

        double exchanges = vnd / 23000;
        System.out.println(vnd + " VND " + " = " + exchanges + " $ ");

    }
}
