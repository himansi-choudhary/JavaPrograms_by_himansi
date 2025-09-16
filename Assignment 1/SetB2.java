package assignment_1;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name + ", Salary: ₹" + salary);
    }
}

public class SetB2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to hold 5 Employee objects
        Employee[] employees = new Employee[5];

        // Input employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            employees[i] = new Employee(name, salary);
        }

        // Display all employee details
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.display();
        }

        sc.close();
    }
}
