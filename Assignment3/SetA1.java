package assignment3;

import java.util.*;

public class SetA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // TreeSet = sorted + no duplicates

        System.out.print("Enter how many integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt()); // duplicate values are ignored automatically
        }

        System.out.println("Sorted unique integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\nEnter number to search: ");
        int key = sc.nextInt();

        if (numbers.contains(key)) {
            System.out.println(key + " is found in the collection.");
        } else {
            System.out.println(key + " is NOT found in the collection.");
        }
    }
}
