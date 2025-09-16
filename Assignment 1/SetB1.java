package assignment_1;

class MyNumber {
    private int number;

    // Default constructor
    public MyNumber() {
        this.number = 0;
    }

    // Parameterized constructor
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return this.number < 0;
    }

    public boolean isPositive() {
        return this.number > 0;
    }

    public boolean isOdd() {
        return this.number % 2 != 0;
    }

    public boolean isEven() {
        return this.number % 2 == 0;
    }

    public int getValue() {
        return this.number;
    }
}

public class SetB1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer value as a command line argument.");
            return;
        }

        try {
            int input = Integer.parseInt(args[0]);
            MyNumber num = new MyNumber(input);

            System.out.println("Number: " + num.getValue());
            System.out.println("Is Positive? " + num.isPositive());
            System.out.println("Is Negative? " + num.isNegative());
            System.out.println("Is Odd? " + num.isOdd());
            System.out.println("Is Even? " + num.isEven());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
