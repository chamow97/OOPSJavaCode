class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Static method to provide the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Get another instance of Singleton
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
