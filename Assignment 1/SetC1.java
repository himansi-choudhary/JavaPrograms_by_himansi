package assignment_1;

import java.util.Scanner;

class MyDateC1 {
    private int day, month, year;

    public MyDateC1() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDateC1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Person {
    private int id;
    private String name;
    private MyDateC1 dob;
    private static int cnt = 1;

    public Person() {
        this.id = cnt++;
        this.name = "";
        this.dob = new MyDateC1();
    }

    public Person(String name, MyDateC1 dob) {
        this.id = cnt++;
        this.name = name;
        this.dob = dob;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();

        dob = new MyDateC1();
        System.out.println("Enter Date of Birth:");
        dob.accept();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Date of Birth: ");
        dob.display();
    }
}

public class SetC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].accept();
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].display();
        }
    }
}
