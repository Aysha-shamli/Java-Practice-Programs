package logicalPrograms;
import java.util.Scanner;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double c = scanner.nextDouble();

        double result = sqrt(c);
        System.out.println("Square root of " + c + " is: " + result);
    }
    public static double sqrt(double c) {
        if (c < 0) {
            System.out.println("Enter a positive number");
        }
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        return t;
    }
}
