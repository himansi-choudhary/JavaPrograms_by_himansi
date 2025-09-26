package assignment3;

import java.util.Scanner;

// User-defined exception class
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    // Constructor
    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if date is valid
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12)
            return false;

        if (day < 1)
            return false;

        int maxDays = daysInMonth(month, year);
        return day <= maxDays;
    }

    // Returns number of days in a month considering leap year
    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Leap year check
    private boolean isLeapYear(int year) {
        if ((year % 400) == 0)
            return true;
        if ((year % 100) == 0)
            return false;
        return (year % 4) == 0;
    }

    // Display method
    public void display() {
        System.out.println("Date: " + String.format("%02d/%02d/%04d", day, month, year));
    }
}

public class SetC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter date (dd mm yyyy): ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            MyDate date = new MyDate(day, month, year);
            date.display();

        } catch (InvalidDateException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input format.");
        } finally {
            sc.close();
        }
    }
}
