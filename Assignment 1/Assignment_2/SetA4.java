package assignment_2;

public class SetA4 {

    // Simulating utility.CapitalString as a static nested class
    static class CapitalString {
        public static String capitalizeFirstLetter(String input) {
            if (input == null || input.isEmpty()) {
                return input;
            }
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        }
    }

    // Person class inside the same file (can be static or regular)
    static class Person {
        String name;
        String city;

        Person(String name, String city) {
            this.name = name;
            this.city = city;
        }
    }

    // Main method
    public static void main(String[] args) {
        Person p = new Person("john", "new york");

        // Capitalize first letter of the name
        String capitalizedName = CapitalString.capitalizeFirstLetter(p.name);

        System.out.println("Person Name (capitalized): " + capitalizedName);
        System.out.println("City: " + p.city);
    }
}

