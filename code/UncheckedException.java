public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Division by zero (ArithmeticException)
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the unchecked exception
            System.out.println("Error: Division by zero is not allowed.");
        }

        try {
            // Accessing an invalid array index (ArrayIndexOutOfBoundsException)
            int[] numbers = {1, 2, 3};
            System.out.println("Number: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the unchecked exception
            System.out.println("Error: Invalid array index.");
        }
    }
}
