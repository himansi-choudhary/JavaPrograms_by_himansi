package assignment_1;

class MyDate {
    int dd, mm, yy;

    // Default constructor
    public MyDate() {
        this.dd = 28;
        this.mm = 9;
        this.yy = 2005;
    }

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Method to display the date in dd-mm-yy format
    public void displayDate() {
        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
    }
}

public class SetA4 {

    public static void main(String[] args) {
        // Using default constructor
        MyDate defaultDate = new MyDate();
        defaultDate.displayDate();

        // Using parameterized constructor
        MyDate customDate = new MyDate(3, 9, 2025);
        customDate.displayDate();
    }
}
