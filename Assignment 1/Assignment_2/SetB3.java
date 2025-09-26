package assignment_2;

import java.util.Scanner;

// Abstract class Staff
abstract class Staff {
    String name;
    String address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Display basic info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// FullTimeStaff subclass
class FullTimeStaff extends Staff {
    String department;
    double salary;
    double hra;  // 8% of salary
    double da;   // 5% of salary

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        this.hra = salary * 0.08;
        this.da = salary * 0.05;
    }

    @Override
    double calculateSalary() {
        return salary + hra + da;
    }

    @Override
    void display() {
        System.out.println("\nFullTimeStaff Details:");
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA (8%): " + hra);
        System.out.println("DA (5%): " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// PartTimeStaff subclass
class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return numberOfHours * ratePerHour;
    }

    @Override
    void display() {
        System.out.println("\nPartTimeStaff Details:");
        super.display();
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class
public class SetB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Staff[] staffArr = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for staff member " + (i + 1) + ":");
            System.out.print("Enter type (1 - FullTimeStaff, 2 - PartTimeStaff): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter address: ");
            String address = sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter department: ");
                String department = sc.nextLine();

                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                staffArr[i] = new FullTimeStaff(name, address, department, salary);
            } else if (choice == 2) {
                System.out.print("Enter number of hours: ");
                int hours = sc.nextInt();

                System.out.print("Enter rate per hour: ");
                double rate = sc.nextDouble();
                sc.nextLine();

                staffArr[i] = new PartTimeStaff(name, address, hours, rate);
            } else {
                System.out.println("Invalid choice! Creating FullTimeStaff with default values.");
                staffArr[i] = new FullTimeStaff(name, address, "Unknown", 0);
            }
        }

        System.out.println("\n\nDisplaying all FullTimeStaff details:");
        for (Staff s : staffArr) {
            if (s instanceof FullTimeStaff) {
                s.display();
            }
        }

        System.out.println("\nDisplaying all PartTimeStaff details:");
        for (Staff s : staffArr) {
            if (s instanceof PartTimeStaff) {
                s.display();
            }
        }

        sc.close();
    }
}
