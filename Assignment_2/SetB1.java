package assignment_2;

// Interface definition
interface Operation {
    double PI = 3.142;
    double area();
    double volume();
}

// Circle class implementing Operation
class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Area of circle = π * r^2
    public double area() {
        return PI * radius * radius;
    }

    // Volume for circle (2D) = 0
    public double volume() {
        return 0.0;
    }

    public void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}

// Cylinder class implementing Operation
class Cylinder implements Operation {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Surface area of cylinder = 2πr(h + r)
    public double area() {
        return 2 * PI * radius * (height + radius);
    }

    // Volume of cylinder = πr^2h
    public double volume() {
        return PI * radius * radius * height;
    }

    public void display() {
        System.out.println("Cylinder with radius: " + radius + " and height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}

// Main class to test
public class SetB1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Cylinder cyl = new Cylinder(5, 10);

        c.display();
        System.out.println();
        cyl.display();
    }
}
