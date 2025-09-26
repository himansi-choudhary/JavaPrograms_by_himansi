package assignment3;

import java.util.*;

public class SetA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Double> employeeTable = new Hashtable<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Accept employee name and salary
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary for " + name + ": ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            employeeTable.put(name, salary);
        }

        // Display all entries
        System.out.println("\n--- Employee Details ---");
        for (Map.Entry<String, Double> entry : employeeTable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Search for a specific employee
        System.out.print("\nEnter employee name to search: ");
        String searchName = sc.nextLine();

        if (employeeTable.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + ": " + employeeTable.get(searchName));
        } else {
            System.out.println(searchName + " not found in the records.");
        }
    }
}

