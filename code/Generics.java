// A generic class
class Box<T> {
    private T item;

    // Method to set the item
    public void setItem(T item) {
        this.item = item;
    }

    // Method to get the item
    public T getItem() {
        return item;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Using the generic class with Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer Box contains: " + integerBox.getItem());

        // Using the generic class with String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics!");
        System.out.println("String Box contains: " + stringBox.getItem());
    }
}
