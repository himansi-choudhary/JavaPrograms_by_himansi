package assignment_2;

import java.util.Scanner;

// Base class
class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "";
        salary = 0.0;
    }

    // Accept method
    void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private double bonus;

    Manager() {
        super();
        bonus = 0.0;
    }

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (Salary + Bonus): " + getTotalSalary());
    }

    double getTotalSalary() {
        return salary + bonus;
    }
}

// Main class
public class SetA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].accept(sc);
        }

        // Find the manager with the highest total salary
        int maxIndex = 0;
        double maxSalary = managers[0].getTotalSalary();

        for (int i = 1; i < n; i++) {
            double total = managers[i].getTotalSalary();
            if (total > maxSalary) {
                maxSalary = total;
                maxIndex = i;
            }
        }

        System.out.println("\nManager with the Highest Total Salary:");
        managers[maxIndex].display();

        sc.close();
    }
}
