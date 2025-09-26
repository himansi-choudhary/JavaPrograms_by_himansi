package assignment_2;

// Superclass Employee
class EmployeeB2 {
    String name;
    double salary;

    // Constructor
    EmployeeB2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Developer extends Employee
class Developer extends EmployeeB2 {
    String projectName;

    // Constructor
    Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    // Display method (overrides and extends Employee display)
    @Override
    void display() {
        super.display();
        System.out.println("Project Name: " + projectName);
    }
}

// Subclass Programmer extends Developer
class Programmer extends Developer {
    String progLanguage;

    // Constructor
    Programmer(String name, double salary, String projectName, String progLanguage) {
        super(name, salary, projectName);
        this.progLanguage = progLanguage;
    }

    // Display method
    @Override
    void display() {
        super.display();
        System.out.println("Programming Language: " + progLanguage);
    }
}

// Main class
public class SetB2 {
    public static void main(String[] args) {
        // Creating Developer object as required
        Developer dev = new Developer("Himansi", 75000, "AI Development");

        System.out.println("Developer Details:");
        dev.display();

        // Optional: Create Programmer object (just to test)
        /*
        Programmer prog = new Programmer("Bob", 80000, "Web App", "Java");
        System.out.println("\nProgrammer Details:");
        prog.display();
        */
    }
}
