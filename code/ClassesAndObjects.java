// Define the class
public class Person {
    // Instance variables (attributes)
    private String name;
    private int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the person's details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("John Doe", 25);

        // Display information
        person1.displayInfo();

        // Modify attributes using setters
        person1.setName("Jane Doe");
        person1.setAge(30);

        // Display updated information
        person1.displayInfo();
    }
}
