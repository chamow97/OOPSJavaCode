// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract void calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Shape reference pointing to Circle object
        Shape shape1 = new Circle(5);
        shape1.display(); // Call the concrete method
        shape1.calculateArea(); // Call the implemented method

        // Shape reference pointing to Rectangle object
        Shape shape2 = new Rectangle(4, 6);
        shape2.display(); // Call the concrete method
        shape2.calculateArea(); // Call the implemented method
    }
}
