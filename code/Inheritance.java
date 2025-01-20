// Base class (Parent)
class Vehicle {
    // Attributes of a vehicle
    String brand;
    int wheels;

    // Constructor to initialize vehicle attributes
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }
}

// Derived class (Child)
class Car extends Vehicle {
    // Additional attribute specific to Car
    int seatingCapacity;

    // Constructor to initialize Car attributes
    public Car(String brand, int wheels, int seatingCapacity) {
        // Call the parent class constructor
        super(brand, wheels);
        this.seatingCapacity = seatingCapacity;
    }

    // Method to display car details
    public void displayCarInfo() {
        // Call the parent class method
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

// Another derived class (Child)
class Bike extends Vehicle {
    // Additional attribute specific to Bike
    boolean hasCarrier;

    // Constructor to initialize Bike attributes
    public Bike(String brand, int wheels, boolean hasCarrier) {
        // Call the parent class constructor
        super(brand, wheels);
        this.hasCarrier = hasCarrier;
    }

    // Method to display bike details
    public void displayBikeInfo() {
        // Call the parent class method
        displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car = new Car("Toyota", 4, 5);
        System.out.println("Car Details:");
        car.displayCarInfo();

        // Create an object of the Bike class
        Bike bike = new Bike("Yamaha", 2, true);
        System.out.println("\nBike Details:");
        bike.displayBikeInfo();
    }
}
