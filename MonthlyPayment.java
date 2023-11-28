package logicalPrograms;
import java.util.Scanner;
public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal loan amount :");
        int P = scanner.nextInt();
        System.out.print("Enter the years to pay off :");
        int Y = scanner.nextInt();
        System.out.print("Enter the interest percentage :");
        double R = scanner.nextDouble();
        int n = 12 * Y;
        double r = R / (12 * 100);
        double powerTerm = Math.pow(1 + r, -n);
        double payment = P * r / (1 - powerTerm);
        System.out.println("The Monthly payment amount is :"+payment);
    }
}
