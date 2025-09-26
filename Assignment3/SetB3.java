package assignment3;

import java.io.*;
import java.util.Scanner;

public class SetB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "customers.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            System.out.print("Enter number of customers: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            // Write customer details to file
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for customer " + (i + 1) + ":");

                System.out.print("Customer ID (int): ");
                int c_id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Customer Name: ");
                String cname = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Mobile No (long): ");
                long mobile_no = sc.nextLong();
                sc.nextLine(); // consume newline

                dos.writeInt(c_id);
                dos.writeUTF(cname);
                dos.writeUTF(address);
                dos.writeLong(mobile_no);
            }
            System.out.println("\nData successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Read and display customer details from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("\nCustomer Details from file:");
            while (true) {
                try {
                    int c_id = dis.readInt();
                    String cname = dis.readUTF();
                    String address = dis.readUTF();
                    long mobile_no = dis.readLong();

                    System.out.println("----------------------------");
                    System.out.println("Customer ID: " + c_id);
                    System.out.println("Customer Name: " + cname);
                    System.out.println("Address: " + address);
                    System.out.println("Mobile No: " + mobile_no);
                } catch (EOFException eof) {
                    // End of file reached
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
