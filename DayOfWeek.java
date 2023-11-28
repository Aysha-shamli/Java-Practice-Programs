package logicalPrograms;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        switch (d0) {
            case 0:
                System.out.println("Day of the week is Sunday ");
                break;
            case 1:
                System.out.println("Day of the week is Monday ");
                break;
            case 2:
                System.out.println("Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("Day of the week is Thursday ");
                break;
            case 5:
                System.out.println("Day of the week is Friday");
                break;
            case 6:
                System.out.println("Day of the week is Saturday ");
                break;
        }

    }
}
