package assignment_2;

public class SetA2_Fibonacci {
    public void generate(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

