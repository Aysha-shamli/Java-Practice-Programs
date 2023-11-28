package logicalPrograms;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for C to F and 2 for F to C :");
        int choice = scanner.nextInt();
        temperatureConversion(choice);
    }
    public static void temperatureConversion( int choice) {
        switch (choice) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter temperature in Celsius: ");
                double Ctemperature = scanner.nextDouble();
                double Ftemp = (Ctemperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: "+Ftemp);
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter temperature in Fahrenheit: ");
                double Ftemperature = sc.nextDouble();
                double Ctemp = (Ftemperature - 32) * 5/9;
                System.out.println("Temperature in Celsius: " +Ctemp);
                break;
            default:
                System.out.println("Invalid scale. Use 'C' for Celsius or 'F' for Fahrenheit.");
                break;
        }
    }
}
