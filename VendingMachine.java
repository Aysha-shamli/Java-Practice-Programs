package logicalPrograms;
import java.util.Scanner;

public class VendingMachine {
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static int[] noteCounter = new int[8];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change amount: ");
        int change = scanner.nextInt();

        if (change > 0) {
            calculateMinNotes(change);
            System.out.println("Number of minimum notes needed: " + getMinNotes());
            displayNotes();
        } else {
            System.out.println("Invalid input. Change should be greater than 0.");
        }
    }
    public static void calculateMinNotes(int amount) {
        if (amount > 0) {
            for (int i = 0; i < notes.length; i++) {
                if (amount >= notes[i]) {
                    int count = amount / notes[i];
                    noteCounter[i] += count;
                    amount -= count * notes[i];
                }
            }
            calculateMinNotes(amount);
        }
    }
    public static int getMinNotes() {
        int minNotes = 0;
        for (int count : noteCounter) {
            minNotes += count;
        }
        return minNotes;
    }
    public static void displayNotes() {
        System.out.println("Notes to be returned:");

        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] > 0) {
                System.out.println(notes[i] + " Rs: " + noteCounter[i] + " notes");
            }
        }
    }
}
