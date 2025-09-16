package assignment_1;

import java.util.Scanner;

class Account {
    int accno;
    String accname;
    double balance;

    // Constructor
    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    // Method to display account details
    public void display() {
        System.out.println("Acc No: " + accno + ", Name: " + accname + ", Balance: ₹" + balance);
    }

    // Static method to sort accounts by balance
    public static void sortAccount(Account[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].balance > accounts[j].balance) {
                    // Swap
                    Account temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
    }
}

public class SetB3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Account[] accounts = new Account[n];

        // Input account details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accno = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Account Name: ");
            String accname = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline

            accounts[i] = new Account(accno, accname, balance);
        }

        // Sort accounts by balance
        Account.sortAccount(accounts);

        // Display sorted accounts
        System.out.println("\nAccounts sorted by balance:");
        for (Account acc : accounts) {
            acc.display();
        }

        sc.close();
    }
}

