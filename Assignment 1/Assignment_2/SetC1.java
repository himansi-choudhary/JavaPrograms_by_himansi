package assignment_2;

// Interface definition
interface CreditCardInterface {
    void viewCreditAmount();
    void useCard(double amount);
    void payCredit(double amount);
    void increaseLimit();
}

// SilverCardCustomer implements CreditCardInterface
class SilverCardCustomer implements CreditCardInterface {
    protected String name;
    protected String cardNumber; // 16 digits
    protected double creditAmount = 0;
    protected double creditLimit = 50000;

    SilverCardCustomer(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void viewCreditAmount() {
        System.out.println(name + " (Silver Card) - Current Credit Amount: Rs." + creditAmount);
        System.out.println("Credit Limit: Rs." + creditLimit);
    }

    @Override
    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Transaction successful. Used Rs." + amount + " on card.");
        } else {
            System.out.println("Transaction failed! Credit limit exceeded.");
        }
    }

    @Override
    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Payment successful. Paid Rs." + amount + " towards credit.");
        } else {
            System.out.println("Payment failed! Amount exceeds current credit amount.");
        }
    }

    @Override
    public void increaseLimit() {
        System.out.println("Silver card customers cannot increase credit limit.");
    }
}

// GoldCardCustomer extends SilverCardCustomer and overrides methods as needed
class GoldCardCustomer extends SilverCardCustomer {
    private int increaseCount = 0;
    private static final int MAX_INCREASES = 3;
    private static final double MAX_INCREASE_AMOUNT = 5000;
    
    GoldCardCustomer(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000;
    }

    @Override
    public void increaseLimit() {
        if (increaseCount < MAX_INCREASES) {
            creditLimit += MAX_INCREASE_AMOUNT;
            increaseCount++;
            System.out.println("Credit limit increased by Rs." + MAX_INCREASE_AMOUNT + 
                ". New credit limit: Rs." + creditLimit);
        } else {
            System.out.println("Increase limit failed! You can increase limit only 3 times.");
        }
    }

    @Override
    public void viewCreditAmount() {
        System.out.println(name + " (Gold Card) - Current Credit Amount: Rs." + creditAmount);
        System.out.println("Credit Limit: Rs." + creditLimit);
    }
}

// Main class to test
public class SetC1 {
    public static void main(String[] args) {
        // Create SilverCardCustomer
        SilverCardCustomer silverCustomer = new SilverCardCustomer("Alice", "1234567890123456");
        // Create GoldCardCustomer
        GoldCardCustomer goldCustomer = new GoldCardCustomer("Bob", "9876543210987654");

        System.out.println("=== Silver Card Customer ===");
        silverCustomer.viewCreditAmount();
        silverCustomer.useCard(20000);      // success
        silverCustomer.useCard(35000);      // fail (exceeds limit)
        silverCustomer.viewCreditAmount();
        silverCustomer.payCredit(5000);     // success
        silverCustomer.viewCreditAmount();
        silverCustomer.increaseLimit();     // fail (not allowed)

        System.out.println("\n=== Gold Card Customer ===");
        goldCustomer.viewCreditAmount();
        goldCustomer.useCard(60000);        // success
        goldCustomer.useCard(45000);        // fail (exceeds limit)
        goldCustomer.viewCreditAmount();
        goldCustomer.payCredit(10000);      // success
        goldCustomer.viewCreditAmount();

        // Increase limit 4 times (last should fail)
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();

        goldCustomer.viewCreditAmount();
    }
}
