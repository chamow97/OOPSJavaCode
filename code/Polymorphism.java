// Base class (Parent)
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animals make sound.");
    }
}

// Derived class (Child 1)
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Derived class (Child 2)
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Class demonstrating method overloading
class Calculator {
    // Overloaded methods for addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrating method overriding (runtime polymorphism)
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks: Woof Woof!
        
        myAnimal = new Cat();
        myAnimal.sound(); // Outputs: Cat meows: Meow Meow!
        
        // Demonstrating method overloading (compile-time polymorphism)
        Calculator calc = new Calculator();
        System.out.println("Addition of integers: " + calc.add(5, 10)); // Outputs: 15
        System.out.println("Addition of doubles: " + calc.add(5.5, 10.5)); // Outputs: 16.0
    }
}
