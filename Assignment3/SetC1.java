package assignment3;

import java.io.*;
import java.util.*;

public class SetC1 {
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Load (Generate and display 10 random two-digit integers)");
            System.out.println("2. Save (Save numbers to file \"number.txt\")");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    loadNumbers();
                    break;
                case 2:
                    saveNumbersToFile();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        sc.close();
    }

    private static void loadNumbers() {
        numbers.clear();
        Random rand = new Random();

        System.out.println("Generated 10 random two-digit numbers:");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90) + 10; // generates 10 to 99 inclusive
            numbers.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void saveNumbersToFile() {
        if (numbers.isEmpty()) {
            System.out.println("No numbers loaded yet! Please use Load option first.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"))) {
            for (int num : numbers) {
                bw.write(num + "\n");
            }
            System.out.println("Numbers saved to file \"number.txt\" successfully.");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}
