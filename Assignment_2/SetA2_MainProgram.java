package assignment_2;

import java.util.Scanner;

public class SetA2_MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
            sc.close();
            return;
        }

        // Create objects
        SetA2_Fibonacci fib = new SetA2_Fibonacci();
        SetA2_Cube cube = new SetA2_Cube();
        SetA2_Square square = new SetA2_Square();
        
        System.out.println();

        // Generate and display series
        fib.generate(n);
        cube.generate(n);
        square.generate(n);

        sc.close();
    }
}

