package assignment3;

import java.util.Scanner;

// Custom exception for number being zero
class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class SetA3 {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            if (number == 0) {
                throw new NumberIsZeroException("Number is 0");
            }

            if (isPrime(number)) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }

        } catch (NumberIsZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
