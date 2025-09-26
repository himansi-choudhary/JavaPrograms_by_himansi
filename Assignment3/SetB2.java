package assignment3;

import java.util.Scanner;

// Custom Exception for invalid name
class NameIsInvalidException extends Exception {
    public NameIsInvalidException(String message) {
        super(message);
    }
}

public class SetB2 {
    // Method to validate doctor name
    public static void validateName(String name) throws NameIsInvalidException {
        // Regex: allow only alphabets (both cases) and spaces
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameIsInvalidException("Name is Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Doctor's Name: ");
        String doctorName = sc.nextLine();

        try {
            validateName(doctorName);
            System.out.println("Doctor's Name is valid: " + doctorName);
        } catch (NameIsInvalidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
