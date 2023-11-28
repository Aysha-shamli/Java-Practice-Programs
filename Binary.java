package logicalPrograms;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = toBinary(decimalNumber);
        System.out.println("Binary Number: " + binaryNumber);

        int swappedDecimal = swapNibbles(decimalNumber);
        System.out.println("After swapping nibbles: " + swappedDecimal);

    }

    public static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        for (int i = 7; i >= 0; i--) {
            int bit = (n >> i) & 1;
            binary.append(bit);
        }

        return binary.toString();
    }
    public static int swapNibbles(int n) {
        // Swap the two nibbles
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }
}
