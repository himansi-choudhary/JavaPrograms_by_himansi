package assignment_1;

import java.util.Arrays;

public class SetA3 {

    public static void main(String[] args) {
        // Sample array
        int[] arr = {12, 5, 8, 3, 17};

        // Calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Sort array in ascending order
        Arrays.sort(arr);

        // Display sorted array
        System.out.println("Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Display sum
        System.out.println("\nSum of Array Elements: " + sum);
    }
}

