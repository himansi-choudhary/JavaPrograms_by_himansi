package assignment_2;

// Base class
class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    void display() {
        System.out.println("Point at (" + x + ", " + y + ")");
    }
}

// Subclass 1: ColorPoint
class ColorPoint extends Point {
    String color;

    // Default constructor
    ColorPoint() {
        super();         // Call to Point default constructor
        color = "Black";
    }

    // Parameterized constructor
    ColorPoint(int x, int y, String color) {
        super(x, y);     // Call to Point parameterized constructor
        this.color = color;
    }

    // Overridden display method
    @Override
    void display() {
        System.out.println("ColorPoint at (" + x + ", " + y + "), Color: " + color);
    }
}

// Subclass 2: Point3D
class Point3D extends Point {
    int z;

    // Default constructor
    Point3D() {
        super();
        z = 0;
    }

    // Parameterized constructor
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Overridden display method
    @Override
    void display() {
        System.out.println("Point3D at (" + x + ", " + y + ", " + z + ")");
    }
}

// Main class with main method
public class SetA1 {

    public static void main(String[] args) {
        // Creating and displaying a basic 2D point
        Point p1 = new Point(5, 7);
        p1.display();

        // Creating and displaying a colored point
        ColorPoint cp = new ColorPoint(3, 4, "Red");
        cp.display();

        // Creating and displaying a 3D point
        Point3D p3d = new Point3D(1, 2, 9);
        p3d.display();
    }
}
