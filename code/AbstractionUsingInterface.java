// Interface
interface Animal {
    void makeSound(); // Abstract method
    void eat(); // Abstract method
}

// Implementation class: Dog
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Implementation class: Cat
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Animal reference pointing to Dog object
        Animal animal1 = new Dog();
        animal1.makeSound();
        animal1.eat();

        // Animal reference pointing to Cat object
        Animal animal2 = new Cat();
        animal2.makeSound();
        animal2.eat();
    }
}
